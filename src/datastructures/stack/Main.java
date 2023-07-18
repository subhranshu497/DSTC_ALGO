package datastructures.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack1<Integer> stack = new Stack1<>();
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        stack.push(4);

        System.out.println("Before sorting:");
        stack.printStack();

        sortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();

    }
    public static String reverseString(String str){
        Stack stack = new Stack();
        String reversedString = "";
        char[] charArr = str.toCharArray();
        for(char c: charArr){
            stack.push(c);
        }
        while(!stack.isEmpty()){
            reversedString += stack.pop();
        }
        return reversedString;
    }
    public static boolean isBalancedParentheses(String parenthesis){
        Stack<Character> stack = new Stack<>();
        for(char p : parenthesis.toCharArray()){
            if(p == '('){
                stack.push(p);
            }
            else if (p == ')'){
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void sortStack(Stack1<Integer> stack){
        Stack<Integer> additionalStack = new Stack<>();

        while(!stack.isEmpty()){
            int temp = stack.pop();
            while(!additionalStack.isEmpty() && additionalStack.peek() >temp){
                stack.push(additionalStack.pop());
            }
            additionalStack.push(temp);
        }
        //for return to main stack
        while(!additionalStack.isEmpty()){
            stack.push(additionalStack.pop());
        }
    }
    public void enQueue(int value){
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(value);
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }
}
