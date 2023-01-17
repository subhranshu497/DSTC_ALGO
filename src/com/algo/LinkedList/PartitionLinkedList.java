package com.algo.LinkedList;

import static com.algo.LinkedList.Node.printLinkedList;

public class PartitionLinkedList {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(3);
        Node n3 = new Node(8);
        Node n4 = new Node(9);
        Node n5 = new Node(4);
        Node n6 = new Node(5);
        Node n7 = new Node(2);
        Node n8 = new Node(13);
        Node n9 = new Node(10);

        //linked node
        n1.next =n2;
        n2.next =n3;
        n3.next =n4;
        n4.next =n5;
        n5.next =n6;
        n6.next =n7;
        n7.next =n8;
        n8.next =n9;
        printLinkedList(n1);
        System.out.println("=====Post Partition=======");
        Node node = partitionALinkedList(n1,4);
        printLinkedList(node);

    }
    public static Node partitionALinkedList(Node head, int x){
        Node lessHead = null;
        Node lessEnd = null;
        Node moreHead = null;
        Node moreEnd = null;

        while(head != null){
            //detaching the node from the linked list
            Node next = head.next ;
            head.next = null;
            //Forming the left linked list
            if(head.data <x){
                if(lessHead == null){
                    lessHead = head;
                    lessEnd = lessHead;
                }
                else{
                    lessEnd.next =head;
                    lessEnd = head;
                }
            }
            else{
                if(moreHead == null){
                    moreHead = head;
                    moreEnd = moreHead;
                }
                else{
                    moreEnd.next =head;
                    moreEnd = head;
                }
            }
            head = next;
        }
        lessEnd.next = moreHead;
        return lessHead;
    }
}
