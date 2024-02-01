package com.leetcode.seventyfive;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
    public static void main(String[] args) {
        int [] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> result = kidWithXtraCandies(candies, extraCandies);
        System.out.println(result);
    }

    private static List<Boolean> kidWithXtraCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max =Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max) max = candies[i];
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies >= max) result.add(true);
            else result.add(false);
        }
        return result;
    }
}
