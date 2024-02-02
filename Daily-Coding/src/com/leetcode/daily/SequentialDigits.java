package com.leetcode.daily;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {
    public static void main(String[] args) {
        int low = 100;
        int high = 300;
        List<Integer> result = seqDigits(low, high);
    }

    private static List<Integer> seqDigits(int low, int high) {
        String digits = "123456789";
        int lowLimit = String.valueOf(low).length(); //3
        int upperLimit = String.valueOf(high).length();//3
        List<Integer> result = new ArrayList<>();
        for(int i=lowLimit;i<=upperLimit;i++){
            for(int j=0;j<10-i;j++){
                int num = Integer.parseInt(digits.substring(j,i));
                if(num >=low && num <= high){
                    result.add(num);
                }
            }
        }
        return result;
    }
}
