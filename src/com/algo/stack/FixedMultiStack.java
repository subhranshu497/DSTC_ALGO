package com.algo.stack;

import java.util.EmptyStackException;

// implement three stacks in an array
public class FixedMultiStack {
    private static int numberOfStacks = 3;
    private static int stackCapacity;
    private static int [] sizes;
    private static int[] values;

    public FixedMultiStack(int stackSize){
        stackCapacity = stackSize;
        sizes = new int[numberOfStacks];
        values = new int[numberOfStacks * stackSize];
    }
    public static boolean isFull(int stackNum){
         return sizes[stackNum] == stackCapacity;
    }

    public static boolean isEmpty(int stackNum){
        return sizes[stackNum] == 0;
    }

    //to calculate index of top for the given stack

    public static int indexOfTop(int stackNum){
      // stackNum = stackNum -1;
        int offset = stackNum * stackCapacity;
        int size = sizes[stackNum];
        int value = offset +size-1;
        return value;
    }

    public static void push(int stackNum, int value){
        stackNum = stackNum -1;
        if(isFull(stackNum))
            throw new StackOverflowError();
        int index = indexOfTop(stackNum);
        values[index] = value;
        sizes[stackNum]++;
    }

    public static int pop(int stackNum){
        stackNum = stackNum -1;
        if(isEmpty(stackNum))
            throw new EmptyStackException();
        int index = indexOfTop(stackNum);
        int value = values[index];
        values[index] = 0;
        sizes[stackNum]--;
        return value;
    }

    public static int peek(int stackNum){
        stackNum = stackNum -1;
        if(isEmpty(stackNum))
            throw new EmptyStackException();
        System.out.println(values[indexOfTop(stackNum)]);
        return values[indexOfTop(stackNum)];
    }

    //driver method
    public static void main(String[] args) {
        FixedMultiStack fixedMultiStack = new FixedMultiStack(3);
        push(2, 2);
        push(2, 3);
        push(2, 4);
        pop(2);
       push(2, 5);
        peek(2);


    }
}
