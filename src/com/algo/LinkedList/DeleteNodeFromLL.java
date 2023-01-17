package com.algo.LinkedList;

import static com.algo.LinkedList.Node.printLinkedList;
//delete a node from a LL, it should not be the first and last node from the LL and given only access to the node
public class DeleteNodeFromLL {
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
        System.out.println("AS IS Linked LIST");
        printLinkedList(n1);
        System.out.println("Linked LIST Post Deletion of element");
        boolean flag = deleteNodeFromMiddle(n5);
        if(flag) printLinkedList(n1);

    }
    public static boolean deleteNodeFromMiddle(Node node){
        if(node == null || node.next == null) return false;
        node.data = node.next.data;
        node.next = node.next.next;
        return true;
    }
}
