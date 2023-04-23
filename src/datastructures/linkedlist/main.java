package datastructures.linkedlist;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class main {
    public static void main(String[] args) {
//        LinkedList myLinkedList = new LinkedList(1);
//        myLinkedList.append(2);
//        myLinkedList.append(3);
//        myLinkedList.append(4);
//        myLinkedList.append(5);
//        myLinkedList.printList();
//        myLinkedList.reverse();
//        System.out.print("\n");
//        myLinkedList.printList();
        Set<Integer> h = new LinkedHashSet<>();
        h.add(2);
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(3);
        System.out.println(h);
    }
}
