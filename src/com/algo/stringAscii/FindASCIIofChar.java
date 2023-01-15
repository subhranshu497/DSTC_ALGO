package com.algo.stringAscii;

public class FindASCIIofChar {
    public static void findASCIIOfString(String str){
        char[] charArr = str.toCharArray();
        int[] intArr = new int[128];
        int count = 0;
        int value =Integer.MIN_VALUE;
        for(int i=0;i<str.length();i++){
            value = str.charAt(i);
            System.out.println("ASCII value of "+charArr[i]+ " is "+value);
        }
    }

    public static void main(String[] args) {
        findASCIIOfString("race car");
    }
}
