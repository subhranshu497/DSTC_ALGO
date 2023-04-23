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
}
