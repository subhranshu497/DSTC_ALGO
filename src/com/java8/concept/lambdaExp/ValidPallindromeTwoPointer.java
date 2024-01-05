package com.java8.concept.lambdaExp;

public class ValidPallindromeTwoPointer {
    public static void main(String[] args) {
        String s = "A man, a3 plan, a canal: Panama";
        System.out.println(isPallindromeJavaEight(s));
    }

    private static boolean isPalliTwoPtr(String s){
        for(int left=0,right=s.length()-1;left<right;left++,right--){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))) right--;
            if(Character.toLowerCase(s.charAt(left)) !=Character.toLowerCase(s.charAt(right))) return false;
        }
        return true;
    }

    private static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(Character ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        String filteredString = sb.toString();

        return filteredString.equals(sb.reverse().toString());
    }

    private static boolean isPallindromeJavaEight(String s){
        StringBuilder sb = new StringBuilder();
        s.chars().filter(c->Character.isLetterOrDigit(c))
                .mapToObj(c->Character.toLowerCase(c))
                .forEach(sb::append);

        return sb.toString().equals(sb.reverse().toString());
    }
}
