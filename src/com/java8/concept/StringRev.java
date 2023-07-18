package com.java8.concept;

public class StringRev {
    public static void main(String[] args) {
        String str = "car";
        System.out.println(reverse(str));
    }

    private static String reverse(String str) {
        String s= new StringBuilder(str).reverse().toString();
        return s;
    }
}
