package datastructures.stack;

public class Stack {
    private Node top;
    private int height;

    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height =1;
    }
    class Node {
        int value;
        Node next;
        public  Node(int value){
            this.value = value;
        }
    }
    public void printStack(){
        Node temp = top;
        while(temp !=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getTop(){
        if(top == null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack top has "+top.value);
        }
    }
    public void getHeight(){
        System.out.println("Height of stack is "+height);
    }
    public void push(int value){
        Node newNode = new Node(value);
        if(height == 0) top = newNode;
        else{
            newNode.next = top;
            top = newNode;
        }
        height++;
    }
    public Node pop(){
        Node temp = top;
        if(height == 0) return null;
        else {
            top = top.next;
            temp.next = null;
            height--;
            return temp;
        }
    }
}
