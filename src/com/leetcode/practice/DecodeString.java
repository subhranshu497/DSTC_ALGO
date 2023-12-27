package com.leetcode.practice;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class DecodeString {
    public static Map<Integer, Integer> memoMap = new HashMap<>();
    public static void main(String[] args) {
        String s = "326";
        System.out.println(decodeStr(s));
    }

    private static int decodeStr(String s) {
        return recursiveWithMemo(0,s);
    }

    private static int recursiveWithMemo(int index, String s) {

        if(memoMap.containsKey(index)){
            return memoMap.get(index);
        }
        if(index == s.length()) return 1;
        if(s.charAt(index)=='0') return 0;
        if(index == s.length()-1) return 1;
        int ans = recursiveWithMemo(index+1, s);
        if(Integer.parseInt(s.substring(index, index+2))<=26){
            ans +=recursiveWithMemo(index+2, s);
        }
        memoMap.put(index, ans);
        return ans;
    }

}
