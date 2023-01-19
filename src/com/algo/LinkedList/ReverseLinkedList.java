package com.algo.LinkedList;

import static com.algo.LinkedList.Node.printLinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        //List
        Node list_n1 = new Node(7);
        Node list_n2 = new Node(1);
        Node list_n3 = new Node(6);
        Node list_n4 = new Node(4);

        //linked node
        list_n1.next =list_n2;
        list_n2.next =list_n3;
        list_n3.next = list_n4;
        System.out.println("====Linked List is=====");
        printLinkedList(list_n1);
        System.out.println();
        Node list_reversed = reverseTheLL(list_n1);
        printLinkedList(list_reversed);
    }
    //7-->1-->6-->4
    public static Node reverseTheLL(Node curr){
        Node prev = null;
        Node next = null;
        while(curr !=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
