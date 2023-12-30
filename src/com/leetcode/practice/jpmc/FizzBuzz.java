package com.leetcode.practice.jpmc;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int n  =16;
        System.out.println(fizBuz(n));

    }

    private static List<String> fizBuz(int n) {
        List<String> result = new ArrayList<>();
        for(int i =1;i<n;i++){
            if(i % 3 == 0 && i % 5 == 0) result.add("FizzBuzz");
            else if(i % 3 == 0) result.add("Fizz");
            else if(i % 5 == 0) result.add("Buzz");
            else result.add(i+"");
        }
        return result;
    }
}
