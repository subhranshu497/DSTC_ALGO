package com.algo.stringCompression;

public class StringCompression {

    public static void main(String[] args) {
        System.out.println(performStringCompression("aaabcccccaa")); //i =0 , j =0 , len = 11
    }
    public static int performStringCompression(String str1){
        char[] charArr = str1.toCharArray();
        int index =0;
        int i = 0;
        while(i<charArr.length){
            int j =i;
            while(j<charArr.length && charArr[j]==charArr[i]) {
                j++;
            }
            charArr[index++] = charArr[i];
            if(j-i>1){
                String count = j-i +"";
                for(char c : count.toCharArray()){
                    charArr[index++]=c;
                }
            }
            i = j;
        }
        return index;
    }
}
