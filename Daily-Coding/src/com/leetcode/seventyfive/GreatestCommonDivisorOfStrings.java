package com.leetcode.seventyfive;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GreatestCommonDivisorOfStrings {
    public static void main(String[] args) {
        String str1 = "ABABABABABAB";
        String str2 = "ABAB";
        System.out.println(gcdOfStrings(str1, str2));
    }

    private static String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)) return "";
        int len1 = str1.length();
        int len2 = str2.length();
        int subLen = gcdStr(len1, len2);
        return str1.substring(0,subLen);
    }

    private static int gcdStr(int len1, int len2) {
        //base condition
        if(len2 == 0) return len1;
        return gcdStr(len2,len1%len2);
    }
}
