package com.leetcode.practice;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static void main(String[] args) {
        String s = "MCMXC";
       int result= romanToIntConversion(s);
        System.out.println(result);
    }

    private static int romanToIntConversion(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('M',1000);
        map.put('D',500);
        map.put('C',100);
        map.put('L', 50);
        map.put('X',10);
        map.put('V',5);
        map.put('I',1);
        int total =0;
        for(int i=0;i<s.length();i++){
            if(i+1<s.length()){
                if(map.get(s.charAt(i))>= map.get(s.charAt(i+1))){
                    total =total+map.get(s.charAt(i));
                }
                else{
                    total =total-map.get(s.charAt(i));
                }
            }
            else{
                total =total+map.get(s.charAt(i));
            }
        }
        return total;
    }

}
