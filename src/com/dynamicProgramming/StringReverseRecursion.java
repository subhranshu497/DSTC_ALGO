package com.dynamicProgramming;

public class StringReverseRecursion {
    public static void main(String[] args) {
        String str = "Lori";
        reverseString(str);
    }
    public static String reverseString(String str){
        if(str == null || str.length()<=1){
            System.out.print(str);
        }
        else{
            System.out.print(str.charAt(str.length()-1));
            reverseString(str.substring(0,str.length()-1));
        }
        return str;
    }
}
