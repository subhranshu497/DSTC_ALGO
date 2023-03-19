package com.java8.concept;

import java.util.function.Consumer;

public class FunctionalInterfaceEx1 {
    public static void main(String[] args) {
        Consumer<String> c1 = (s)-> System.out.println(s.toUpperCase());
        c1.accept("kiana");
    }
}
