package com.leetcode.Oracle;

import java.util.List;

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        int n = 2;
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode ans = removeNthFromEnd(head,n);
        //print the list
        while(ans !=null){
            System.out.println(ans.val+", ");
            ans = ans.next;
        }
    }

    private static ListNode removeNthFromEnd(ListNode head, int n) {
        // calculate the length of the list
        int length = 0;
        ListNode temp = head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        while(head != null){
            length++;
            head = head.next;
        }
        int pos = length - n;
        temp = dummy;
        while(pos>0){
            pos--;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return dummy.next;
    }
}
class ListNode{
    int val;
    ListNode next;
    public ListNode(){}
    public ListNode(int val){
        this.val = val;
    }
    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
