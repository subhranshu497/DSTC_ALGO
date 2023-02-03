package com.algo.stack;

public class StackDriver {
    public static void main(String[] args) {
        Integer value;
        StackMin2 s1 = new StackMin2();
        s1.push(70);
        s1.push(80);
        s1.push(40);
        s1.push(50);
        s1.push(90);
        value = s1.min();
        System.out.println(value);
        s1.pop();
        s1.pop();
        value = s1.min();
        System.out.println(value);
        s1.push(10);
        s1.push(5);
        s1.push(95);
        value = s1.min();
        System.out.println(value);
        s1.pop();
        value = s1.min();
        System.out.println(value);

    }
}
