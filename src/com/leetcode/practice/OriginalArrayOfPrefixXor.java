package com.leetcode.practice;

public class OriginalArrayOfPrefixXor {
    public static void main(String[] args) {
        int [] prefix = {5,2,0,3,1};
        formXORArray(prefix);
    }

    private static int[] formXORArray(int[] prefix) {
        int [] out = new int[prefix.length];
        out[0]=prefix[0];
        for(int i =1;i<prefix.length;i++){
            out[i]=prefix[i] ^ prefix[i-1];
        }
        return out;
    }
}
