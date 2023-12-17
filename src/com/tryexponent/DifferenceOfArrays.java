package com.tryexponent;

import org.junit.platform.commons.util.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

public class DifferenceOfArrays {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4};
        Integer[] arr2 = {3,4,5,6};
        //System.out.println(findIntersection(arr1, arr2));
        System.out.println(findDiffFun(arr1, arr2));
    }

    private static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        List<Integer> resultList = new ArrayList<>();
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for(int item1: arr1){
            map1.put(item1, map1.getOrDefault(item1,0)+1);
        }
        for(int item2: arr2){
            map2.put(item2, map2.getOrDefault(item2,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry1:map1.entrySet()){
            if(!map2.containsKey(entry1.getKey())) resultList.add(entry1.getKey());
        }
        for(Map.Entry<Integer,Integer> entry2:map2.entrySet()){
            if(!map1.containsKey(entry2.getKey())) resultList.add(entry2.getKey());
        }
        //Integer[] result = resultList.stream().toArray(Integer[] ::new);
        return resultList;

    }
    private static List<Integer> findDiffFun(Integer[] arr1, Integer[] arr2){
        List<Integer> list1 = Arrays.asList(arr1);
        List<Integer> list2 = Arrays.asList(arr2);
        List<Integer> resultList1 = list1.stream().filter(item1->!list2.contains(item1)).collect(Collectors.toList());
        List<Integer> resultList2 = list2.stream().filter(item2->!list1.contains(item2)).collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();
        for(Integer item : resultList1){
            result.add(item);
        }
        for(Integer item : resultList2){
            result.add(item);
        }
        return result;
    }
}
