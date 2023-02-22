package com.algo.anagram;

import java.util.HashMap;
import java.util.Hashtable;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "nameless";
        String s2 = "saleiman";
        boolean flag = checkAnagram(s1, s2);
        if(flag)
            System.out.println(s1+" and "+s2+" are anagram");
        else
            System.out.println(s1+" and "+s2+" are not anagram");

    }
    public static boolean checkAnagram(String s1, String s2){
        if (s1.length() != s2.length())
            return false;
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for(char c1 : s1.toCharArray()){
            if(hm1.get(c1) == null)
                hm1.put(c1,1);
            else {
                Integer freq1 = (Integer) hm1.get(c1);
                hm1.put(c1, freq1++);
            }
        }
        for(char c2 : s2.toCharArray()){
            if(hm2.get(c2) == null)
                hm2.put(c2, 1);
            else{
                Integer freq2 = hm2.get(c2);
                hm2.put(c2, freq2++);
            }
        }
        if(hm1.equals(hm2))
            return true;
        else
            return false;
    }
}
