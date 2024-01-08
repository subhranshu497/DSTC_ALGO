package com.algo.LinkedList;

public class LinkedListDemo {
     int data;
     LinkedListDemo next;
     public LinkedListDemo(){}
    public LinkedListDemo(int data){
         this.data = data;
    }
    public LinkedListDemo(int data, LinkedListDemo next){
         this.data = data;
         this.next = next;
    }
    public void printll(LinkedListDemo root){
         while(root !=null){
             System.out.print(root.data+", ");
             root = root.next;
         }
    }

    public LinkedListDemo addLast(LinkedListDemo ll, LinkedListDemo newNode){
         if(ll == null){
             ll = newNode;
             return ll;
         }
         LinkedListDemo last = ll;
         while(last.next !=null){
             last = last.next;
         }
         last.next = newNode;

         return ll;
    }
}
class LinkedListDemoDriver{
    public static void main(String[] args) {
        LinkedListDemo ll = new LinkedListDemo(1);
        ll.next = new LinkedListDemo(2);
        ll.next.next = new LinkedListDemo(3);
        ll.next.next.next = new LinkedListDemo(4);
        ll.next.next.next.next = new LinkedListDemo(5);
        ll.printll(ll);
        LinkedListDemo newNode = new LinkedListDemo(6);
        LinkedListDemo newLl = ll.addLast(ll,newNode);
        System.out.println("----------------");
        newLl.printll(ll);
    }
}
