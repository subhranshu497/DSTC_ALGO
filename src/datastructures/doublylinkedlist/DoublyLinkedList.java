package datastructures.doublylinkedlist;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int length;
    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        length = 1;
    }
    class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }
    }
    /**
     * print list
     */
    public void printList(){
        Node temp = head;
        while(temp !=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead(){
        if(head == null) return ;
        else {
            System.out.println("Head is "+head.value);
        }
    }
    public void getTail(){
        if(tail == null) return;
        else{
            System.out.println("Tail is "+tail.value);
        }
    }

    public void getLength(){
        System.out.println(" Length is "+length);
    }
    /**
     * Append to the list
     */
    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }
    public Node removeLast(){
        if(length ==0) return null;
        Node temp = tail;
        if(length == 1){
            head = null;
            tail = null;
        }
        else{
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }
    public void prepend(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        length++;
    }
    public Node removeFirst(){
        Node temp = head;
        if(length == 0) return null;
        else if (length == 1){
            head = null;
            tail = null;
        }
        else{
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        return temp;
    }

    public Node get(int index){
        if(index < 0 || index >=length) return null;
        else if(index < length/2){
            Node temp = head;
            for(int i=0;i<index;i++){
                temp = temp.next;
            }
            return temp;
        }
        else{
            Node temp = tail;
            for(int i =length-1;i>index;i--){
                temp = temp.prev;
            }
            return temp;
        }
    }
    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp !=null){
            temp.value = value;
            return true;
        }
        return false;
    }
    public boolean insert(int index, int value){
        Node newNode = new Node(value);
        if(index < 0 || index >=length) return false;
        if(index == 0){
            prepend(value);
            return true;
        }
        else if(index == length-1){
            append(value);
            return true;
        }
        else{
            Node before = get(index-1);
            Node after = before.next;
            newNode.prev = before;
            newNode.next = after;
            before.next = newNode;
            after.prev = newNode;
            length++;
            return true;
        }
    }
    public Node remove(int index){
        Node temp = get(index);
        if(index <0 || index >= length) return null;
        if(index == 0) removeFirst();
        if(index == length-1) removeLast();

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        temp.next = null;
        temp.prev =null;
        length--;
        return temp;
    }
    /**
     * swap the value of head and tail
     */
    public void swapFirstLast(){
        if(length < 2) return;
        int temp = head.value;
        temp = head.value;
        head.value = tail.value;
        tail.value = temp;
    }
    public void reverse(){
        Node current = head;
        Node temp =null;
        while(current !=null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        temp = head;
        head = tail;
        tail = temp;

    }
    public boolean isPalindrome(){
        Node forward = head;
        Node reverse = tail;
        int count = length/2;
        if(length == 0) return false;
        else if(length ==1) return true;
        else{
            for(int i=0;i<=count;i++){
                if(forward.value != reverse.value) return false;
                forward = forward.next;
                reverse = reverse.prev;
            }
            return true;
        }
    }
    public void swapPairs(){
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        while(head != null && head.next != null){
            Node firstNode = head;
            Node secondNode = head.next;
            //update ptr and swap node
            prev.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;
            //swap prev
            secondNode.prev = prev;
            firstNode.prev = secondNode;
            if(firstNode.next != null){
                firstNode.next.prev = firstNode;
            }
            head = firstNode.next;
            prev = firstNode;
        }
            head = dummy.next;
    }
}
