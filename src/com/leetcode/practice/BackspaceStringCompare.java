package com.leetcode.practice;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(stringCompare(s,t));

    }

    private static boolean stringCompare(String s, String t) {
        //String actualString = getActual(s,t);

        return getActual(s).equals(getActual(t));
    }

    private static String getActual(String s) {
        StringBuilder actualString = new StringBuilder();
        //String actualString ="";
        int hashCount =0;
        for(int i=s.length()-1;i>=0;i--){
            // check for hash count and build
            if(hashCount ==0 && s.charAt(i) !='#'){
                actualString = actualString.append(s.charAt(i));
                //actualString = actualString+s.charAt(i);
            }
            //check for # and keep increasing the hash count
            else if(s.charAt(i)=='#'){
                hashCount++;
            }
            //check for hashcount , if it is not zero then skip appending the char
            else{
                hashCount--;
            }
        }
        return actualString.toString();
    }
}
