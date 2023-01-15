package com.algo.pallindrome;

public class stringPallindrome {
    public static boolean checkPallindrome(String str){
        char[] charArr = str.toCharArray();
        int length = str.length();
        for(int i=0;i<length;i++){
            if((i<length-1-i)&&(charArr[i] != charArr[length-1-i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPallindrome("abba"));
    }
}
