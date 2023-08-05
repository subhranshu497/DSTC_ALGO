package com.leetcode.practice;

public class ZigzagConversion {
    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
        int rowNum = 4;
        System.out.println(convert(str,rowNum));
    }

    private static String convert(String str, int rowNum) {
        String result ="";
        if(str.isEmpty()) return result;
        int step = 2*(rowNum-2);
        for(int i=0;i<rowNum;i++){
            for(int j=i;j<str.length();j+=step){
                result += str.charAt(j);
                if(i>=1 && i<=rowNum-2 && j+(step-2*i)<str.length()){
                    result +=str.charAt(j+step-2*i);
                }
            }
        }
        return result;
    }
}
