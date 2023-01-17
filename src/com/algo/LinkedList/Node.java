package com.algo.LinkedList;

public class Node {
    int data;
    Node next =null;

    public Node(int data){
        this.data = data;
    }
    //Printing Linked List
    public static void printLinkedList(Node head){
        if(head == null) return;
        System.out.print(head.data +" "+"-->");
        Node curr_node = head.next;
        while (curr_node != null){
            System.out.print(curr_node.data +" "+"-->");
            curr_node = curr_node.next;
        }
    }
}
