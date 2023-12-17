package com.tryexponent;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 5, 6, 7};
        Integer[]  arr2 = {3, 6, 7, 8, 20};
        System.out.println(findDuplicateBetweenArr(arr1, arr2));
    }

    private static List<Integer> findDuplicateBetweenArr(Integer[] arr1, Integer[] arr2) {
        List<Integer> list1 = Arrays.asList(arr1);
        List<Integer> list2 = Arrays.asList(arr2);
        return list1.stream().filter(dup->list2.contains(dup)).collect(Collectors.toList());
    }
}
