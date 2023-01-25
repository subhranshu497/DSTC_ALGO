package com.algo.stack;

import java.util.EmptyStackException;

public class MyStack<T>{
    private T data;
    private MyStack<T> next;
    private MyStack<T> top;

    public MyStack(T data){
        this.data = data;
    }
    //deleting an item from the stack
    public T pop(){
        if(top == null) throw new EmptyStackException();
        T item = top.data;
        top = top.next;
        return item;
    }
    //adding an item to the stack
    public void push(T item){
        MyStack<T> t = new MyStack<>(item);
        t.next = top;
        top = t;
    }
    //peeking an item from stack
    public T peek(){
        if(top == null) throw new EmptyStackException();
        return top.data;
    }
    public boolean isEmpty(){
        return top == null;
    }
}
