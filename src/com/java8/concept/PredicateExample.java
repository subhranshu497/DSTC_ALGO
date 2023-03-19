package com.java8.concept;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> p1 = (i) -> i/2==0;
    static Predicate<Integer> p2 = (i) -> i/5==0;

    public static void predicateAnd(){
        System.out.println("Predicate And is "+p1.and(p2).test(3));
    }
    public static void predicateOr(){
        System.out.println("Predicate Or is "+p1.or(p2).test(4));
    }
    public static void predicateNegate(){
        System.out.println("Predicate negate is "+ p1.negate().test(5));
    }
    public static void main(String[] args) {
        predicateAnd();
        predicateOr();
        predicateNegate();

    }
}
