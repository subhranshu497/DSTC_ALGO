package com.algo.stringOps;

public class checkPallindrome {
    public static void main(String[] args) {
        String str = "madm";
        String input =str.toLowerCase();
        char [] inputArr = input.toCharArray();
        //for int
        int num =121;
        char [] inputIntArr = (""+num).toCharArray();

        //boolean flag = checkPallindromeForAll(inputArr);
        boolean flag = checkPallindromeForAll(inputIntArr);
        if(flag)
            System.out.println("String is pallindrome");
        else
            System.out.println("String is not pallindrome");
    }
    public static boolean checkPallindromeForAll(char [] input){
        int len = input.length;

        for(int i =0; i<len/2;i++){
            if(input[i] != input [len-1-i])
               return false;
        }
        return true;
    }
}
