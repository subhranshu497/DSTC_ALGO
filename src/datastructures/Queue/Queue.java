package datastructures.Queue;

public class Queue {
    private int length;
    private Node first;
    private Node last;

    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }
    class Node {
        int value;
        Node next;

        public Node(int value){
            this.value =value;
        }
    }
    public void printQueue(){
        Node temp = first;
        if(length == 0) System.out.println("Queue is empty");
        else{
            while(temp != null){
                System.out.println(temp.value);
                temp = temp.next;
            }
        }
    }
    public void getFirst(){
        System.out.println("First of the queue is "+first.value);
    }
    public void getLast(){
        System.out.println("Last of the queue is "+last.value);
    }
    public void getHeight(){
        System.out.println("Height of the queue is "+length);
    }
    public void enQueue(int value){
        Node newNode = new Node(value);
        if(length == 0) first = last = newNode;
        else{
            last.next = newNode;
            last = newNode;
        }
        length++;
    }
    public Node deQueue(){
        Node temp = first;
        if(length ==0) return null;
        else if(length == 1){
            first =null;
            last = null;
        }
        else{
            first = first.next;
            temp.next = null;
        }
        length--;
        return temp;
    }
}
