package com.java8.concept;

import java.util.Arrays;
import java.util.List;

public class FindFirstInList {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        findFirstElement(numList);
    }

    private static void findFirstElement(List<Integer> numList) {
        numList.stream().findFirst().ifPresent(System.out::println);
    }
}
