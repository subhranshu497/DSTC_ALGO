package com.leetcode.daily;

import java.util.Stack;

/**
 * Leetcode #232
 * Implement Queue using stack
 */
public class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    private int top;

    public MyQueue(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    public void push(int x){
        if(stack1.isEmpty()) top = x;
        while(!stack1.isEmpty()) stack2.push(stack1.pop());
        stack2.push(x);
        while(!stack2.isEmpty()) stack1.push(stack2.pop());
    }
    public int pop(){
        int result = stack1.pop();
        if(!stack1.isEmpty()) top = stack1.peek();
        return result;
    }
    public int peek(){
        return top;
    }
    public boolean empty(){
        return stack1.isEmpty();
    }
}
