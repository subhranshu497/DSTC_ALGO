package com.java8.concept;

import java.util.Comparator;

public class LambdaExComparatorInterface {
    public static void main(String[] args) {
        /**
         * Comparator Impl before Java 8
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        /**
         * Comparator impl with Lambda exp
         */
        Comparator<Integer> comparator1 = (Integer a, Integer b) -> {
            return a.compareTo(b);
        };
        /**
         * more concise coding of lambda
         */
        Comparator<Integer> comparator2 = (a,b) -> a.compareTo(b);
        System.out.println("Result is "+comparator2.compare(12,12));
    }
}
