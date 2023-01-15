package com.algo.pallindrome;

public class PermutationPallindrome {
    public static boolean checkPermutationPallindrome(String str){
        int[] table = new int[128];
        char[] chrArr = str.toCharArray();
        int oddCount =0;
        for(int i=0;i<str.length();i++){
           // System.out.println("Pre increment "+chrArr[i]+" "+table[str.charAt(i)]);
            table[str.charAt(i)]++;
            //System.out.println("post increment "+chrArr[i]+" "+table[str.charAt(i)]);
        }
        for(int i=0;i<128;i++){
            //System.out.println("before check "+oddCount);
            oddCount += table[i] % 2;
            //System.out.println("after check "+oddCount);
        }
        return oddCount <=1;
    }

    public static void main(String[] args) {
        String str= "Tcat oca";
        String result = str.replaceAll("\\s","");

        System.out.println(result);
        System.out.println(checkPermutationPallindrome(result.toLowerCase()));
    }
}
