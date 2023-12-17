package com.browse.blind;


public class LinkedListCycle {
    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(4);
        head.next.next.next.next  = head.next;
        System.out.println(cycleDetection(head));
    }

    private static boolean cycleDetection(Node head) {
        //if(head == null || head.next == null) return false;
        Node rabbit = head.next;
        Node tortoise = head;
        while(rabbit != null && rabbit.next !=null){
            tortoise = tortoise.next;
            rabbit = rabbit.next.next;
            if(tortoise == rabbit) return true;
        }
        return false;
    }
}
