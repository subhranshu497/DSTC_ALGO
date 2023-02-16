package com.algo.stack;

import java.util.Stack;

public class SortStack {
    public Stack<Integer> sort(Stack<Integer> s){
        Stack<Integer> r= new Stack<>();
        while(r.isEmpty()) {
            int temp = s.pop();
            while(!r.isEmpty() && s.peek() > temp){
                s.push(r.pop());
            }
            r.push(temp);
        }
        return r;
    }
}
