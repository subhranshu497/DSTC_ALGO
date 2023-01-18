package com.algo.LinkedList;

import static com.algo.LinkedList.Node.printLinkedList;

/*
This code will sum up two linked list from right to left and create a new ll

 */
public class SumListLinkedList {
    public static void main(String[] args) {
        //List1
        Node list1_n1 = new Node(7);
        Node list1_n2 = new Node(1);
        Node list1_n3 = new Node(6);

        //linked node
        list1_n1.next =list1_n2;
        list1_n2.next =list1_n3;
        System.out.println("====First List is=====");
        printLinkedList(list1_n1);
        System.out.println();

        //List 2
        Node list2_n1 = new Node(5);
        Node list2_n2 = new Node(9);
        Node list2_n3 = new Node(2);
        Node list2_n4 = new Node(1);

        list2_n1.next =list2_n2;
        list2_n2.next =list2_n3;
        list2_n3.next =list2_n4;
        System.out.println("====Second List is=====");
        printLinkedList(list2_n1);
        System.out.println();
        System.out.println("=======post sum =======");
        Node output = sumList_RightToLeft(list1_n1, list2_n1);
        printLinkedList(output);
    }
    public static Node sumList_RightToLeft(Node list1 , Node list2){
         Node output_head = null;
         Node output_ptr = null;
         int carry = 0;
         //7-->1-->6
        //5-->9-->2-->1
         while(list1 != null || list2 != null || carry !=0){
             int result = 0;
             if(list1 != null){
                 result +=list1.data;
                 list1 = list1.next;
             }
             if(list2 != null){
                 result +=list2.data;
                 list2 = list2.next;
             }
             result = result +carry;
             carry = result / 10;
             result = result % 10;
             Node new_node = new Node(result);
             if(output_head == null){
                 output_head = new_node;
                 output_ptr = output_head;
             }
             else{
                 output_ptr.next = new_node;
                 output_ptr = new_node;
             }
         }
         //opt put = 2-->1-->9-->1
        return output_head;
    }
}
