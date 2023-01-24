package com.algo.LinkedList;

import static com.algo.LinkedList.Node.printLinkedList;

//1. find the linked list is cyclic or not
//2. return the node where the cycle begins
public class CycleDetectionLL {
    public static void main(String[] args) {
        //List1
        Node list1_n1 = new Node(7);
        Node list1_n2 = new Node(1);
        Node list1_n3 = new Node(6);
        Node list1_n4 = new Node(8);
        Node list1_n5 = new Node(9);
        Node list1_n6 = new Node(10);


        //linked node
        list1_n1.next =list1_n2;
        list1_n2.next =list1_n3;
        list1_n3.next =list1_n4;
        list1_n4.next =list1_n5;
        list1_n5.next =list1_n5;
        //list1_n6.next =list1_n3;
        System.out.println("====List is=====");
        printLinkedList(list1_n1);
        System.out.println();
        boolean flag = detectCycleLL(list1_n1);
        if(flag)
            System.out.println("The list is a cyclic Linked List");
    }
    public static boolean detectCycleLL(Node head){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                break;
        }
        if(fast == null || fast.next == null) {
            System.out.println("The Linked list is not a cyclic one");
            return false;
        }
        else{
            slow =head;
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
            System.out.println("Cycle starts at node "+slow.data);
        }
        return true;
    }
}
