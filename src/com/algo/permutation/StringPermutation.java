package com.algo.permutation;

import java.util.Arrays;

public class StringPermutation {
    //god
    //dog
    public static String sortString(String str){
        char[] content = str.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
    public static boolean checkPermutation(String str1, String str2){
        str1 = str1.replaceAll("\\s","");
        str2 = str2.replaceAll("\\s","");
        if(str1.length() != str2.length())
            return false;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        return sortString(str1).equals(sortString(str2));
    }

    public static void main(String[] args) {
        System.out.println(checkPermutation("dog"," GOe "));
    }
}
