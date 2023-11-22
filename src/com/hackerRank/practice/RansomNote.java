package com.hackerRank.practice;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {
        List<String> magazine = List.of("give", "me", "one", "grand", "today", "night");
        List<String> note = List.of("give", "me", "one","grand", "today");
        System.out.println(check(magazine, note) ? "Yes" : "No");
    }

    private static boolean check(List<String> magazine, List<String> note) {
        Map<String, Integer> magazineMap = new HashMap<>();
        Map<String, Integer> noteMap = new HashMap<>();
        for(String m: magazine){
            if(!magazineMap.containsKey(m)) magazineMap.put(m,0);
            else{
                magazineMap.put(m, magazineMap.get(m)+1);
            }
        }
        //populate note map
        for(String n: note){
            if(!noteMap.containsKey(n)) noteMap.put(n,0);
            else{
                noteMap.put(n, magazineMap.get(n)+1);
            }
        }
        for(String s : noteMap.keySet()){
            if(!magazineMap.containsKey(s)) return false;
            int wordCount = noteMap.get(s);
            if(wordCount > magazineMap.get(s)) return false;
        }
        return true;
    }
}
