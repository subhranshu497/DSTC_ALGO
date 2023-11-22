package com.leetcode.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountNicePairInAnArray {
    public static void main(String[] args) {
        int[] nums = {13,10,35,24,76};
        System.out.println(nicePair(nums));
    }

    private static int nicePair(int[] nums) {
        final int mod = 1000000007;
        HashMap<Integer,Integer> map = new HashMap<>();
        int answer = 0;
        for(int num: nums){

            int temp = num-rev(num);
            int pairs = map.getOrDefault(temp,0);
            if(pairs!=0){
                answer=(answer+pairs)%mod;
            }

            map.put(temp,pairs+1);
        }


        return answer;
    }

    private static int rev(int x){
        int result =0;
        // x =123
        while(x>0){
            int rem = x % 10;
            result = result*10 + rem;
            x /=10;
        }
        return result;
    }
}
