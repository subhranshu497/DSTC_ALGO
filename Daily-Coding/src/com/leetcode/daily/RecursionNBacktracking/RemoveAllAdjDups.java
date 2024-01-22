package com.leetcode.daily.RecursionNBacktracking;

public class RemoveAllAdjDups {
    // Driver code
    public static void main(String args[])
    {
        String str2 = "azxxxzy";
        System.out.println(removeDuplicates(str2));
    }

    // with o(N) time complexity
        public static String removeDuplicates(String S) {
            StringBuilder sb = new StringBuilder();
            int sbLength = 0;
            for(char character : S.toCharArray()) {
                if (sbLength != 0 && character == sb.charAt(sbLength - 1))
                    sb.deleteCharAt(sbLength-- - 1);
                else {
                    sb.append(character);
                    sbLength++;
                }
            }
            return sb.toString();
        }
    private static String remove(String str) {
        String str1 = "";
        while(str.length() != str1.length()){
            str1= str;
            str = removeUtil(str1);
        }
        return str;
    }
    private static String removeUtil(String s){
        int n = s.length();
        int i =0;
        StringBuilder ans = new StringBuilder();
        while(i<n){
            if(i<n-1 && s.charAt(i)==s.charAt(i+1)){
                while(i<n-1 && s.charAt(i)==s.charAt(i+1)){
                    i++;
                }
            }
            else{
                ans.append(s.charAt(i));
            }
            i++;
        }
        return ans.toString();
    }

}
