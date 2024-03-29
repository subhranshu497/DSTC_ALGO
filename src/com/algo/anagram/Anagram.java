package com.algo.anagram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "restful";
        String s2 = "luf";
        char[]s11 = s1.toCharArray();
        char[]s22 = s2.toCharArray();
        boolean flag = solve(s11,s22);
        //boolean flag = checkAnagram(s1, s2);
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

    public static boolean solve(char[] s1, char[] s2) {

        if(s1.length != s2.length) return false;
        Arrays.sort(s1);
        Arrays.sort(s2);
        int i=0;
        while(i<s1.length){
            if(s1[i] !=s2[i]) return false;
            i++;
        }
        return true;
    }
}
