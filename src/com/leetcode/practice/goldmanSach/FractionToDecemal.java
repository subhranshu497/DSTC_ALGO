package com.leetcode.practice.goldmanSach;

import java.util.HashMap;
import java.util.Map;

public class FractionToDecemal {
    public static void main(String[] args) {
        int numerator = 1;
        int denominator = 2;
        System.out.println(fractionToDecimal(numerator, denominator));
    }

    private static String fractionToDecimal(int numerator, int denominator) {
        if(numerator ==0) return "0";
        StringBuilder sb = new StringBuilder();
        if(numerator<0 ^ denominator<0) sb.append("-");
        long dividend = Math.abs(Long.valueOf(numerator));
        long divisor = Math.abs(Long.valueOf(denominator));
        sb.append(String.valueOf(dividend/divisor));
        long rem = dividend % divisor;
        if(rem == 0) return sb.toString();
        sb.append(".");
        Map<Long, Integer> map = new HashMap<>();

        while(rem !=0){
            if(map.containsKey(rem)){
                sb.insert(map.get(rem),"(");
                sb.append(")");
                break;
            }
            map.put(rem, sb.length());
            rem *=10;
            sb.append(String.valueOf(rem/divisor));
            rem %=divisor;
        }
        return sb.toString();
    }
}
