package com.udemyLearning.arrays;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Shafeeq";
        reverseString(str);
    }
    public static void reverseString(String str){
        StringBuffer sb = new StringBuffer();
        char[] charArr = str.toCharArray();
        for(int i=0;i<charArr.length;i++){
            sb.append(charArr[charArr.length-1-i]);
        }
        System.out.println("String has been reversed "+sb);
    }
}
