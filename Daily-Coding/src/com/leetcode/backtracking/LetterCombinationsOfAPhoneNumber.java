package com.leetcode.backtracking;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        String digits = "23";
        List<String> result = letterCombinationRecursion(digits);
        System.out.println(result);
    }

    private static List<String> letterCombinations(String digits) {
        Map<String, String> digitsMap = new HashMap<>();
        digitsMap.put("2", "abc");
        digitsMap.put("3", "def");
        digitsMap.put("4", "ghi");
        digitsMap.put("5", "jkl");
        digitsMap.put("6", "mno");
        digitsMap.put("7", "pqrs");
        digitsMap.put("8", "tuv");
        digitsMap.put("9", "wxyz");

        Deque<String> deck= new ArrayDeque<>();
        deck.addFirst("");
        //first loop is to iterate the input digit and get the coresponding vlue from map
        for(int i=0;i<digits.length();i++){
            String digitPart = digits.substring(i,i+1); //2
            String fromMap = digitsMap.get(digitPart); //abc
            int n = deck.size();
            //to iterate the deck
            for(int j=0;j<n;j++){
                String fromQ = deck.pollFirst();
                //add to deck
                for(int k =0;k<fromMap.length();k++){
                    String temp = fromQ.concat(fromMap.charAt(k)+"");
                    deck.add(temp);
                }
            }
        }
        List<String> result = new ArrayList<>();
        while(!deck.isEmpty()){
            result.add(deck.poll());
        }
        System.out.println(result);
        return result;

    }
    private static List<String> letterCombinationRecursion(String digits){
        List<String> result = new ArrayList<>();
        if(digits.length()==0) return result;
        String [] mapping = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        dfs(0,digits, result, new StringBuilder(), mapping);
        return result;
    }
    private static void dfs(int length, String digits, List<String> result, StringBuilder sb, String[] mappings){

        //base condition
        if(length == digits.length()){
            result.add(sb.toString());
            return;
        }
        //extract the char from the digits
        char ch = digits.charAt(length);
        String str = mappings[ch-'0'];
        for(char c:str.toCharArray()){
            sb.append(c);
            dfs(length+1, digits, result, sb, mappings);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
