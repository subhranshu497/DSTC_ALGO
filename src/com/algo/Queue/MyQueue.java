package com.algo.Queue;

import java.util.NoSuchElementException;

public class MyQueue<T> {
    private T data;
    private MyQueue<T> next;
    private MyQueue<T> first;
    private MyQueue<T> last;
    public MyQueue(T data){
        this.data = data;
    }
    //Adding an element to queue
    public void add(T item){
        MyQueue<T> t = new MyQueue<>(item);
        if(last != null){
            last.next = t;
        }
        last = t;
        if(first == null)
            first = last;
    }
    //deleting an element from the queue
    public T remove(){
        if(first == null) throw new NoSuchElementException();
        T data = first.data;
        first = first.next;
        if(first == null)
            last = null;
        return data;

    }
    //peeking an element from Queue
    public T peek(){
        if(first == null) throw new NoSuchElementException();
        return first.data;
    }
    public boolean isEmpty(){
        return first == null;
    }
}
