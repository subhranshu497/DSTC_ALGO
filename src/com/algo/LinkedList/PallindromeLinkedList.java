package com.algo.LinkedList;

import static com.algo.LinkedList.Node.printLinkedList;

public class PallindromeLinkedList {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(3);
        Node n3 = new Node(8);
        Node n4 = new Node(9);
        Node n5 = new Node(4);
        Node n6 = new Node(9);
        Node n7 = new Node(8);
        Node n8 = new Node(3);
        Node n9 = new Node(1);

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
        System.out.println();
        System.out.println("=====Post Pallindrome Check=======");
        boolean flag = checkPallindromeLL(n1);
        System.out.println(flag);
        if(flag)
            System.out.println("Linked List is pallindrome");
        else
            System.out.println("Linked List is not pallindrome");
    }
    public static boolean checkPallindromeLL(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println();
        printLinkedList(slow);
        slow = reverseLinkedList(slow);
        System.out.println();
        printLinkedList(slow);
        fast = head;
        while(slow != null){
            if(slow.data != fast.data)
                return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
    public static Node reverseLinkedList(Node head){
        Node prev = null;
        while(head != null){
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

}
