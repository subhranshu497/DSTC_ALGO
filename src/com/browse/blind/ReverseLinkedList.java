package com.browse.blind;

class Node{
    int value;
    Node next;
    public Node(int value){
        this.value = value;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next  = new Node(5);
        printLinkedList(head);
        Node reversed = reverseLinkedList(head);
        System.out.println();
        printLinkedList(reversed);
    }

    private static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node curr = head;
        while(curr !=null){
            Node newNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = newNode;
        }
        return prev;
    }

    private static void printLinkedList(Node head) {
        while(head != null){
            System.out.print(head.value+" --> ");
            head = head.next;
        }
    }

}
