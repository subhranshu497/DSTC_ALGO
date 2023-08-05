package com.java8.concept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumStartsWithOne {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(10,15,8,49,25,98,32);
         findNum(numList);
    }

    private static void findNum(List<Integer> numList) {
        numList.stream().map(s ->s+"").filter(s ->s.startsWith("1"))
                .forEach(System.out::println);
    }
}
