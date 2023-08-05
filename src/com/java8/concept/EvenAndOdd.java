package com.java8.concept;

import java.util.List;
import java.util.stream.Collectors;

public class EvenAndOdd {
    public static void main(String[] args) {
        List<Integer> numList = List.of(1,2,3,4,5,6,7,8);
        List<Integer> oddNum = findOdd(numList);
        System.out.println(oddNum);
    }

    private static List<Integer> findOdd(List<Integer> numList) {
        return numList.stream().filter(n -> n%2 !=0)
                .collect(Collectors.toList());
    }
}
