package com.algo.LinkedList;

import static com.algo.LinkedList.Node.printLinkedList;

public class IntersectionLL {
    public static void main(String[] args) {
        //List1
        Node list1_n1 = new Node(1);
        Node list1_n2 = new Node(2);
        Node list1_n3 = new Node(3);
        Node list1_n4 = new Node(4);
        Node list1_n5 = new Node(5);
        Node list1_n6 = new Node(6);
        Node list1_n7 = new Node(7);
        Node list1_n8 = new Node(8);

        //linked node
        list1_n1.next =list1_n2;
        list1_n2.next =list1_n3;
        list1_n3.next =list1_n4;
        list1_n4.next =list1_n5;
        list1_n5.next =list1_n6;
        list1_n6.next =list1_n7;
        list1_n7.next =list1_n8;
        System.out.println("====First List is=====");
        printLinkedList(list1_n1);
        System.out.println();

        //List 2
        Node list2_n1 = new Node(9);
        Node list2_n2 = new Node(6);
        Node list2_n3 = new Node(7);
        Node list2_n4 = new Node(8);

        list2_n1.next =list2_n2;
        list2_n2.next =list2_n3;
        list2_n3.next =list2_n4;
        System.out.println("====Second List is=====");
        printLinkedList(list2_n1);
        System.out.println();
        int result = findIntersectionNode1(list1_n1, list2_n1);
        System.out.println("Intersection Node is "+result);
    }
    // Approach 1
    public static int findIntersectionNode1(Node list1, Node list2){
        Node temp1 = list1;
        Node temp2 = list2;
        while(temp1 != temp2){
            if(temp1 == null)
                temp1 = list2;
            if(temp2 == null)
                temp2 = list1;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        if(temp1 != null)
            return temp1.data;
       else
           return -1;
    }

    //approach 2 - Lengthy
    public static Node findIntersectionNode2(Node list1, Node list2){
        int len1 = 0;
        int len2 = 0;
        Node temp1 = list1;
        Node temp2 = list2;
        while(list1 != null){
            list1 = list1.next;
            len1++;
        }
        System.out.println("Length of first lsit is "+len1);
        while(list2 != null){
            list2 = list2.next;
            len2++;
        }
        System.out.println("Length of second lsit is "+len2);
        int diff = Math.abs(len2 - len1);
        System.out.println("Difference in length is "+diff);
        if(len1 > len2)
            while(diff-- >0){
                temp1 = temp1.next;
            }
        if(len2 > len1)
            while(diff-- >0){
                temp2 = temp2.next;
            }
        System.out.println();
        System.out.println("=====Temp1 List is========");
        printLinkedList(temp1);
        System.out.println();
        System.out.println("=====Temp2 List is========");
        printLinkedList(temp2);
        //Do the equality check
        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
            System.out.println("Temp1 "+temp1.data);
            System.out.println("Temp2 "+temp2.data);
            if(temp1 == null || temp2 == null)
                return null;
        }
        return temp1;
    }
}
