package com.leetcode.practice;

public class LargestThreeDigitNumberInAString {
    public static void main(String[] args) {
        String num = "2300019";
        //System.out.println(largestThreeDigit(num));
        System.out.println(largestThreeDigitOptimed(num));
    }

    private static String largestThreeDigitOptimed(String num) {

        for(int i=9;i>=0;i++){

            String sub = String.format("%d%d%d", i,i,i);
            if(num.contains(sub)) return sub;
        }
        return "";
    }


    private static String largestThreeDigit(String num) {
        char[] charArr = num.toCharArray();
        StringBuilder sb = new StringBuilder();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<charArr.length-2 ; i++)
        {
            if(charArr[i] == charArr[i+1] && charArr[i+1] == charArr[i+2]){
                sb.append(charArr[i]);
                sb.append(charArr[i+1]);
                sb.append(charArr[i+2]);
                max = Math.max(max,Integer.valueOf(sb.toString()));
            }
            sb.setLength(0);
        }
        if(max == 0) return max+"00";
        else if(max < 0) return "";
        return max+"";
    }
}
