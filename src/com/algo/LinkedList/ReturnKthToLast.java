package com.algo.LinkedList;
//Returning the value of the Kth node from last
import static com.algo.LinkedList.Node.printLinkedList;


public class ReturnKthToLast {

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
        Node node = returnKthToLast(n1,5);
        System.out.println();
        System.out.println("The value of the Kth node from the last is "+node.data);
    }
    public static Node returnKthToLast(Node head, int k){
        Node p = head;
        Node q = head;

        for(int i=1;i<k;i++){
            System.out.println("i is "+i);
            if (q == null) return null;
            q = q.next;
        }
        while(q.next != null){
            p = p.next;
            q = q.next;
        }
        return p;
    }
}
