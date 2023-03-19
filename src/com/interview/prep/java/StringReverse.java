package com.interview.prep.java;

public class StringReverse {
    public static void main(String[] args){
        String str = "KIANA";
        //String output = stringReverse1(str);
        //String output = stringReverse2(str);
        String output = stringReverse3(str);
        System.out.println("Reverse is "+output);
    }
    /*
        Using for loop
         */
    public static String stringReverse1(String str){
        String output= "";
        for(int i = str.length()-1;i>=0;i--){
            output = output + str.charAt(i);
        }
        return output;
    }

    /*
    using stringbuffer method
     */
    public static String stringReverse2(String str){
        StringBuffer sb = new StringBuffer(str);
        return sb.reverse().toString();
    }
    /*
    using Recursion
     */
    public static String stringReverse3(String str){
        if(str == null || str.length() <=1){
            return str;
        }
        else {
            return stringReverse3(str.substring(1))+str.charAt(0);
        }
    }
}
