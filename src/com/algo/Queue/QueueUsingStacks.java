package com.algo.Queue;

import java.util.Stack;

public class QueueUsingStacks <T>{
    public Stack<T> newestStack;
    public Stack<T> oldestStack;

    public QueueUsingStacks(){
        newestStack = new Stack<>();
        oldestStack = new Stack<>();
    }
    public  int size(){
        return  newestStack.size() + oldestStack.size();
    }

    public void add(T value){
        //push to the newest stack . New element would be on the top
        newestStack.push(value);
    }
    //Move from newest stack to oldest stack
    public void shiftStacks(){
        if(oldestStack.isEmpty()){
            while(!newestStack.isEmpty()){
                oldestStack.push(newestStack.pop());
            }
        }
    }

    public T peek(){
        shiftStacks();
        return oldestStack.peek();
    }
    public T remove(){
        shiftStacks();
        return oldestStack.pop();
    }
}
