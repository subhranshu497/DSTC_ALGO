package com.java8.concept;

import java.util.Arrays;
import java.util.List;

public class FindMaximumValue {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        findMax(numList);
    }

    private static void findMax(List<Integer> numList) {
        System.out.println(numList.stream().max(Integer::compare).get());
    }
}
