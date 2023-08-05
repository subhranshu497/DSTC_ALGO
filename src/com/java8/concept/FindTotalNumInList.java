package com.java8.concept;

import java.util.Arrays;
import java.util.List;

public class FindTotalNumInList {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        System.out.println(findTotalNumberOfInteger(numList));
    }

    private static long findTotalNumberOfInteger(List<Integer> numList) {
        return numList.stream().count();
    }
}
