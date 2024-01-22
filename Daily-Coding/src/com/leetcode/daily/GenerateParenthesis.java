package com.leetcode.daily;

import java.util.ArrayList;
import java.util.List;

//leetcode #22
public class GenerateParenthesis {
    public static void main(String[] args) {
        int n=2;
        List<String> result = genParen(n);
        System.out.println(result);
    }

    //n = 2 , o/p - ()(),(())
    private static List<String> genParen(int n) {
        List<String> strList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        dfs(n-1,n,strList,sb);
        return strList;
    }
    //recursion
    private static void dfs(int open, int closed, List<String> strList, StringBuilder sb){
        //base condition
        if(open ==0 && closed == 0)strList.add(sb.toString());
        if(open<0 || closed<0)return;
        sb.append("(");
        if(open <=closed){
            sb.append(")");
            dfs(open,closed-1,strList, sb);
        }
        else{
            dfs(open-1,closed, strList, sb);
        }
    }
}
