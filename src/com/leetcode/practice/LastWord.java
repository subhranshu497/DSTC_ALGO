package com.leetcode.practice;

import java.util.ArrayList;
import java.util.List;

public class LastWord {
    public static void main(String[] args) {
        String str = "Hello world  Lori";
        System.out.println(lengthOfLastWord(str));
    }
    private static int lengthOfLastWord(String str) {
        List<String> list = new ArrayList<>();
        String word ="";
        for(char c:str.toCharArray()){
            if(c == ' '){
                list.add(word);
                word ="";
            }
            else{
                word = word+c;
            }
        }
        list.add(word);
        return list.get(list.size()-1).length();
    }

//    private static int lengthOfLastWord(String str) {
//        String s1 = str.trim();
//        int len=0;
//        for(int i=0;i<s1.length();i++){
//            if(s1.charAt(i)==' '){
//                len =0;
//            }
//            else len++;
//        }
//        return len;
//    }
}
