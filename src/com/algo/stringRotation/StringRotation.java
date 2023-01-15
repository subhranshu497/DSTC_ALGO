package com.algo.stringRotation;

public class StringRotation {
    public static void main(String[] args) {
        //System.out.println(rotateString("waterbottle", "erbottlewaf")); // output = true
        System.out.println(rotateStringWithSubString("waterbottle", "erbottlewat")); // output = true

    }
    public static boolean rotateString(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        StringBuilder s3 = new StringBuilder();
        s3.append(s1);
        s3.append(s1);
        if(s3.indexOf(s2) !=-1)
            return true;
        return false;
    }
    //using isSubstring method
    public static boolean rotateStringWithSubString(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        String s3 = s1+s1;
        int len = s2.length();
        for(int i=0;i< len;i++){
            if(s3.subSequence(i,len+i).equals(s2))
                return true;
        }
        return false;
    }
}
