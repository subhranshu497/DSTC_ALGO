package com.leetcode.seventyfive;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ReverseVowelsofaString {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(revVowels(s));
    }

    private static String revVowels(String s) {
        Set<Character> vowelSet = new HashSet<>();
        vowelSet.add('a');
        vowelSet.add('e');
        vowelSet.add('i');
        vowelSet.add('o');
        vowelSet.add('u');
        vowelSet.add('A');
        vowelSet.add('E');
        vowelSet.add('I');
        vowelSet.add('O');
        vowelSet.add('U');
        char[] charArr = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while(i<charArr.length && !vowelSet.contains(charArr[i])) i++;
            while(j >=0 && !vowelSet.contains(charArr[j])) j--;
            if(i<j) swap(charArr,i++,j--);
        }
        return new String(charArr);
    }

    public static void swap(char[] charArr, int left, int right){
        char temp = charArr[left];
        charArr[left] = charArr[right];
        charArr[right] = temp;
    }
}
