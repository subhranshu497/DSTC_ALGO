package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode 17
 *
 */
public class GenerateParenthesis {
    public static void main(String[] args) {
        int n =3;
        List<String> result = genParenthesis(n);
    }

    private static List<String> genParenthesis(int n) {
        List<String> result = new ArrayList<>();
        String current = "(";
        parenrec(current,1,0,n, result);
        System.out.println(result);
        return result;
    }
    private static void parenrec(String current, int open, int close, int n, List<String> result){
        //base condition
        if(current.length() == 2*n) {
            result.add(current);
            return;
        }
        if(open < n) parenrec(current+"(",open+1,close,n, result);
        if(close < open) parenrec(current+")", open, close+1, n, result);
    }
}
