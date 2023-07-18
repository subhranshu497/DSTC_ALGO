package com.leetcode.practice;

public class SolutionRough {

    public static void main(String[] args) {
        String[] strs = {"flower", "filow","flight"};
        //String prefix = "flower";
        //System.out.println(strs[1].indexOf(prefix));
       longestCommonPrefix(strs);
    }

    /**
     * step 1 - set longest common pefix to first element of the array
     * define a loop to iterate the string ARRAY
     * as first elment is assumed to be prefix, so start index of the loop will be 1
     * define a loop to compare each element of the string array with the prefix
     * decrement the prefix one by one by using substring menthod, until it reaches the max common substring
     * @param strs
     */

    private static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix) !=0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        System.out.println(prefix);
        return prefix;
    }

}
