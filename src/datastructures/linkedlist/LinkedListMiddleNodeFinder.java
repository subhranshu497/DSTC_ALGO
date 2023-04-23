package datastructures.linkedlist;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedListMiddleNodeFinder {

        private Node head;
        private Node tail;

        private int length;

        class Node {
            int value;
            Node next;

            Node(int value) {
                this.value = value;
            }
        }

        public LinkedListMiddleNodeFinder(int value) {
            Node newNode = new Node(value);
            head = newNode;
            tail = newNode;
            length = 1;
        }

        public Node getHead() {
            return head;
        }

        public Node getTail() {
            return tail;
        }

        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.value);
                temp = temp.next;
            }
        }

        public void printAll() {
            if (head == null) {
                System.out.println("Head: null");
                System.out.println("Tail: null");
            } else {
                System.out.println("Head: " + head.value);
                System.out.println("Tail: " + tail.value);
            }
            System.out.println("\nLinked List:");
            if (head == null) {
                System.out.println("empty");
            } else {
                printList();
            }
        }

        public void makeEmpty() {
            head = null;
            tail = null;
        }

        public void append(int value) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
    public Node get(int index){
        if(index <0) return null;
        Node temp = head;
        for(int i =0;i<index;i++){
            temp = temp.next;
        }
        return temp;
    }
        public Node findMiddleNode(){
            Node temp = head;
            int count = 0;
            int index =0;
            if(temp == null) return null;
            while(temp.next != null){
                count++;
                temp = temp.next;
            }
            if(count % 2 == 0) index = count /2;
            else index = (count /2)+1;
            return get(index);
        }
    /**
     * find middle node using two pointer
     */
    public Node findMiddleNodeTwoPointer(){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean hasLoop(){
        Node slow = head;
        Node fast = head;

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public Node findKthFromEnd(int k){
        Node fast = head;
        Node slow = head;
        for(int i = 0;i<k;i++){
            if(fast == null) return null;
            fast = fast.next;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
    public void removeDuplicates(){
        Node current = head;
        Node prev = null;
        Set<Integer> h = new LinkedHashSet<>();
        while(current!= null){
            if (h.contains(current.value)){
                prev.next = current.next;
                this.length -=1;
            }
            else{
                prev = current;
                h.add(current.value);
                current = current.next;
            }
            current = current.next;
        }

    }
    /***
     * REmove duplicates with O n2 time complexity
     */
    public void findDuplicate2(){
        Node current = head;
        while(current != null){
            Node runner = current;
            while(runner.next != null){
                if(current.value == runner.next.value){
                    runner.next = runner.next.next;
                    length -=1;
                }
                else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }
    /**
     * partition list
     */
    public void partitionList(int x){
        if(head == null) return;
        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);
        Node prev1 = dummy1;
        Node prev2 = dummy2;
        Node current = head;
        while(current != null){
            if(current.value <x){
                prev1.next = current;
                prev1 = current;
            }
            else{
                prev2.next = current;
                prev2 = current;
            }
            current = current.next;
        }
        prev2.next =null;
        prev1.next = dummy2.next;
        head = dummy1.next;
    }

}
