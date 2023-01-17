package com.algo.LinkedList;

import java.util.HashSet;

import static com.algo.LinkedList.Node.printLinkedList;

public class RemoveDupLL {
    public static void main(String[] args) {
        Node n1 = new Node(2);
        Node n2 = new Node(1);
        Node n3 = new Node(3);
        Node n4 = new Node(3);
        Node n5 = new Node(2);
        Node n6 = new Node(0);

        //linked node
        n1.next =n2;
        n2.next =n3;
        n3.next =n4;
        n4.next =n5;
        n5.next =n6;
        printLinkedList(n1);
        removeDupFromLL(n1);
        System.out.println();
        System.out.println("Post removal of Dups ");
        printLinkedList(n1);

    }
    //remove Dups
    public static void removeDupFromLL(Node node) {
        HashSet<Integer> hs = new HashSet<>();
        Node prev = null;
        while(node.next != null){
            if(!hs.contains(node.data)){
                hs.add(node.data);
                prev = node;
            }
            else{
                prev.next = node.next;
            }
            node = node.next;
        }
    }
}
