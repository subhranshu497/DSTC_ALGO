package com.leetcode.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BuildArrayWithStackOps {
    public static void main(String[] args) {
        int n= 3;
        int [] target = {1,3};
        System.out.println(buildArray(target, n));
    }

    private static List<String> buildArray(int[] target, int n) {
        List<String> results = new ArrayList<>();
        Set<Integer> targetSet = new HashSet<>();

        for(int num: target){
            targetSet.add(num);
        }

        for(int i =1;i<= target[target.length-1];i++){

            if(targetSet.contains(i)) results.add("Push");
            else {
                results.add("Push");
                results.add("Pop");
            }
        }
        return results;
    }
}
