package com.datastructure.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class FindingMiddleNodeInALinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        //System.out.println(findMiddleNode(head));

        Node result = reverseLLInplace(head);
        System.out.println("Post resverse---------");
        while(result !=null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static Node reverseLLInplace(Node head){
       Node prev = null;
       Node nextP = null;
       Node current = head;
       while(current != null){
           nextP = current.next;
           current.next = prev;
           prev = current;
           current = nextP;
       }
       return prev;
    }
    private static int findMiddleNode(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }
}

class Node{
    int val;
    Node next;
    public Node(int val){
        this.val = val;
    }
    public Node(int val, Node next){
        this.val = val;
        this.next = next;
    }
}
