package com.java8.concept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CodeSnippet {
    public static void main(String[] args) {
        Integer[] intArr = {1,2,3,4,5,6,7,8,9,10};
        findEvenOdd(intArr);
    }

    private static void findEvenOdd(Integer[] intArr) {
        //convert array to list
        List<Integer> intList = Arrays.asList(intArr);
        intList.stream().filter(x->x%2==0).forEach(System.out::println);
    }
}
