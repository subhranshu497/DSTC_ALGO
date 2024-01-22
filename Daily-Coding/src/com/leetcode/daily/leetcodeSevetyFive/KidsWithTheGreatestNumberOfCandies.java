package com.leetcode.daily.leetcodeSevetyFive;

import java.util.ArrayList;
import java.util.List;

//leetcode problem number 1431
public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> results = kidsWithCandies(candies, extraCandies);
        System.out.println(results);
    }

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> results = new ArrayList<>();
        int max =Integer.MIN_VALUE;
        for(int candy:candies){
            if(candy > max) max = candy;
        }
        for(int candy: candies){
            if(candy +extraCandies >= max) results.add(true);
            else
             results.add(false);
        }
        return results;
    }
}
