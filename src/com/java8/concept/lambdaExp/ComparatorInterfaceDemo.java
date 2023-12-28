package com.java8.concept.lambdaExp;

import java.util.Comparator;

public class ComparatorInterfaceDemo {
    public static void main(String[] args) {
        withoutLambda();
        withLambda();
    }
    public static void withoutLambda(){
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("Without using lambda "+com.compare(2,3));
    }

    public static void withLambda(){
        Comparator<Integer> com = (o1,o2)->o1.compareTo(o2);
        System.out.println("With Lambda Expression "+com.compare(3,2));
    }
}
