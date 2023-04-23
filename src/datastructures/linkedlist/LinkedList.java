package datastructures.linkedlist;

public class LinkedList {
    Node head;
    Node tail;
    int length;

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length =1;
    }
    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void makeEmpty(){
        head = null;
        tail = null;
        length = 0;
    }
//to append a node
    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    //remove last
    public Node removeLast(){
        Node pre = head;
        Node temp = head;
        if(length == 0) return null;
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next =null;
        length --;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }
    /**
     * Append a node at the begining of the linked list
     */
    public void prepend(int value){
        Node newNode = new Node(1);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }
    public Node removeFirst(){
        if(length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length == 0) tail = null;
        return temp;
    }
    /**
     * Get the node at an index
     */
    public Node get(int index){
        if(index <0 || index >=length) return null;
        Node temp = head;
        for(int i =0;i<index;i++){
            temp = temp.next;
        }
        return temp;
    }
    /**
     * Set the node at an index
     */
    public boolean set(int value, int index){
        Node temp = get(index);
        System.out.println("Temp value is "+temp.value);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }
    /**
     * insert at any index
     */
    public boolean insert(int value, int index){
        Node newNode = new Node(9);
        if(index == 0){
            prepend(newNode.value);
            return true;
        }
        if(index == length-1){
            append(newNode.value);
            return true;
        }
        Node temp = get(index-1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }
    /**
     * remove at any index
     */
    public Node remove(int index){
        if(index < 0 || index >=length) return null;
        if(index == 0) return removeFirst();
        if(index == length-1) return removeLast();
        Node prev = get(index-1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }
    /**
     * reverse a linked list in place
     */
    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;

        for(int i=0;i<length;i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
}
