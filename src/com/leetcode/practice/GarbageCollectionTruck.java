package com.leetcode.practice;

import java.util.Arrays;

public class GarbageCollectionTruck {
    public static void main(String[] args) {
        String[] garbage = {"G", "P", "GP", "GG"};
        int [] travel = {2,4,3};
        System.out.println(garbageCollection(garbage, travel));
    }

    private static int garbageCollection(String[] garbage, int[] travel) {
        int ans = 0;
        // assume the max travel time
        for(int i =0 ; i<travel.length;i++){
            ans +=3*travel[i];
        }
        // add the house garbage
        for(String s :garbage){
            ans +=s.length();
        }
        // subtract the house if it does not have that garbage
        for(int i = garbage.length-1;i>0;i--){
            if(!garbage[i].contains("M")) ans -=travel[i-1];
            else break;
        }
        for(int i = garbage.length-1;i>0;i--){
            if(!garbage[i].contains("G")) ans -=travel[i-1];
            else break;
        }
        for(int i = garbage.length-1;i>0;i--){
            if(!garbage[i].contains("P")) ans -=travel[i-1];
            else break;
        }
        return ans;
    }
}
