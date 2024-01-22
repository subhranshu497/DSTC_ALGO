package com.leetcode.daily.leetcodeSevetyFive;

//Leetcode #345
public class ReverseVowelOfAString {
    public static void main(String[] args) {
        String s = "leetcod";
        System.out.println(reverseVowels(s));
    }

    private static String reverseVowels(String s) {
        int left = 0;
        int right = s.length()-1;
        char[] charArr = s.toCharArray();
        while(left<right){
            while (left < s.length() && !isVowel(charArr[left])) left++;
            while (right>=0 && !isVowel(charArr[right])) right--;
            if(left<right) swap(charArr, left, right);
        }
        return new String(charArr);
    }
    private static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
    private static void swap(char[] chars, int x , int y){
        char temp = chars[x];
        chars[x] = chars[y];
        chars[y] = temp;
    }
}
