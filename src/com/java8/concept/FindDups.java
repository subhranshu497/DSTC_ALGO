package com.java8.concept;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDups {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        findDuplicates(numList);
    }

    private static void findDuplicates(List<Integer> numList) {
        Set<Integer> set = new HashSet<>();
        numList.stream().filter(n -> !set.add(n)).forEach(System.out::println);
    }
}
