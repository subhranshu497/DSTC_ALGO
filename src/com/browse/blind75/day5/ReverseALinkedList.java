package com.browse.blind75.day5;

import java.util.Stack;

public class ReverseALinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        reverseLinkedListWithoutAddlDstc(head);
    }

    private static ListNode reverseLinkedList(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while(head != null){
            stack.push(head.value);
            head = head.next;
        }
        ListNode newNode = new ListNode(Integer.MIN_VALUE);
        ListNode ptr = newNode;
        while(!stack.isEmpty()){
            ptr.next = new ListNode(stack.pop());
            ptr = ptr.next;
        }
        return newNode;
    }
    // reverse the linkedlist without using additional dstc
    private static ListNode reverseLinkedListWithoutAddlDstc(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr !=null){
            ListNode newNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = newNode;
        }
        return prev;
    }
}
class ListNode{
    int value;
    ListNode next;
    ListNode (){}
    ListNode(int value){
        this.value = value;
    }
    ListNode(int value, ListNode next){
        this.value = value;
        this.next = next;
    }
}
