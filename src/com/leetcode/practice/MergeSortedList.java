package com.leetcode.practice;

import java.util.LinkedList;
import java.util.List;

class ListNode{
    int value;
    ListNode next;
    ListNode(){
    }
    ListNode(int value){
        this.value = value;
    }
    ListNode(int value, ListNode next){
        this.value = value;
        this.next = next;
    }
}

public class MergeSortedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2  = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode result = mergeUtil(l1, l2);
        //print a linked list
        while(result != null){
            System.out.print(result.value+" ");
            result = result.next;
        }
    }
    /**
     * using iteration
     */
    private static ListNode mergeUtil(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode tail = head;
        while(l1 != null && l2 != null){
            if(l1.value < l2.value){
                tail.next =l1;
                l1 = l1.next;
            }
            else{
                tail.next =l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        tail.next = l1 ==null?l2:l1;
        return head.next;
    }

    /**
     * using recursion
     * @param l1
     * @param l2
     */
//    private static ListNode mergeUtil(ListNode l1, ListNode l2) {
//        ListNode head ;
//        // base condition
//        if(l1 == null ) return l2;
//        if(l2 == null) return l1;
//        if(l1.value < l2.value){
//            head = l1;
//            l1 = l1.next;
//        }
//        else{
//            head = l2;
//            l2 = l2.next;
//        }
//        head.next = mergeUtil(l1, l2);
//
//        return head;
//    }
}
