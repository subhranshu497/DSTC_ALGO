package com.algo.oneAway.operation.string;

public class OneAwayOperationStringMatch {
    public static void main(String[] args) {
        //System.out.println("inside main");
        System.out.println(oneAwayChecker("pale", "ple"));
        System.out.println(oneAwayChecker("pales", "pale"));
        System.out.println(oneAwayChecker("pale", "bale"));
        System.out.println(oneAwayChecker("pale", "bake"));
    }
    public static boolean oneAwayChecker(String s1, String s2){
        int value =0;
        if(s1.length() == s2.length()){
            value = oneAwayStringEqual(s1, s2);
           // System.out.println("inside if");
        }
        else if(s1.length() > s2.length()){
           // System.out.println("Inside else if ");
            value = oneAwayStringNotEqual(s1,s2);
        }
        else{
           // System.out.println("Inside else");
            value = oneAwayStringNotEqual(s2,s1);
        }
        if(value >=2)
            return false;
        return true;
    }
    public static int oneAwayStringNotEqual(String str1, String str2) {
        int count =0,i = 0;
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        //System.out.println("s1 length "+str1.length() +" s2 length "+str2.length());
        while(i<str2.length()){
            if(s1[i+count] != s2[i]){
                count++;
            }
            i++;
        }
        return count;
    }
    public static int oneAwayStringEqual(String str1, String str2){
        int count =0;
        char[]s1 = str1.toCharArray();
        char[]s2 = str2.toCharArray();
        for(int i=0;i<=str1.length()-1;i++){
            if(s1[i] != s2[i])
                count++;
        }
        return count;
    }
}
