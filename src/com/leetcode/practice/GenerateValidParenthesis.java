package com.leetcode.practice;

import java.util.ArrayList;
import java.util.List;

public class GenerateValidParenthesis {
    public static void main(String[] args) {
        int n = 3;
        List<String> r= generateP(n);
        System.out.println(r);
    }

    private static List<String> generateP(int n) {
        List<String> result = new ArrayList<>();
        String current = "(";
        int o=1;
        int c =0;
        findallParenthesis(current,result,n,o,c);
        return result;
    }

    private static void findallParenthesis(String current, List<String> result, int n, int o, int c) {

        if(current.length() == 2*n) result.add(current);
        if(o<n) findallParenthesis(current+"(",result,n,o+1,c);
        if(c<o)findallParenthesis(current+")", result,n,o,c+1);
    }
}
