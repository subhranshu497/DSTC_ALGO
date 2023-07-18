package datastructures.stack;

public class StackMain {
    public static void main(String[] args) {
        Stack stack = new Stack(4);
        stack.printStack();
        stack.getTop();
        stack.getHeight();
        System.out.println("Lets push to stack==========");
        stack.push(5);
        stack.push(6);
        stack.printStack();
        System.out.println("Lets Pop from stack==========");
        stack.pop();
        stack.printStack();
        stack.getHeight();
    }
}
