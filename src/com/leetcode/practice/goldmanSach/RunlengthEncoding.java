package com.leetcode.practice.goldmanSach;

import java.util.HashMap;
import java.util.Map;

public class RunlengthEncoding {
    public static void main(String[] args) {
        String s = "abbbcaadd";
        System.out.println(runLength(s));
    }

    private static String runLength(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> freqMap = new HashMap<>();
        int i =0;
        while(i<s.length()){
            if(freqMap.isEmpty()) {
                freqMap.put(s.charAt(i), 1);
            }
            else if(s.charAt(i) == s.charAt(i-1)){
                int val = freqMap.get(s.charAt(i))+1;
                freqMap.put(s.charAt(i),val);
            }
            else{
                sb.append(s.charAt(i-1));
                sb.append(freqMap.get(s.charAt(i-1)));
                freqMap.remove(s.charAt(i-1));
                freqMap.put(s.charAt(i), 1);
            }
            i++;
        }
        if(!freqMap.isEmpty()){
            sb.append(s.charAt(s.length()-1));
            sb.append(freqMap.get(s.charAt(s.length()-1)));
            freqMap.remove(s.charAt(s.length()-1));
        }
        return sb.toString();
    }
}
