package com.algo.unique;

public class UniqueCharOnString {
    //abcd
    //abcdea
    public static void main(String[] args) {
        System.out.println(findUniqueChar("abcd"));
    }
    public static boolean findUniqueChar(String str){
        boolean[] cahrArr = new boolean[128];
        if(str.length() > 128){
            return false;
        }
        for(int i=0;i < str.length();i++){
            int value = str.charAt(i);
            if(cahrArr[value])
                return false;
            cahrArr[value] = true;
        }
        return true;
    }
}
