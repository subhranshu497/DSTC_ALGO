package com.algo.replaceSpace;

public class ReplaceSpace {
    public static void main(String[] args) {
        replaceSpace("Mr John Smith          ", 13);
    }
    public static void replaceSpace(String str,int truelength){
        char[] charArr = str.toCharArray();
        int spaceCount =0, i , index;
        for(i=0;i<truelength;i++){
            if(charArr[i] == ' '){
                spaceCount++;
            }
        }
        index = truelength+spaceCount *2;
        if(truelength<str.length()){
            charArr[truelength] ='\0';
        }
        for(i=truelength-1;i>=0;i--){
            if(charArr[i] == ' '){
                charArr[index-1]='0';
                charArr[index-2]='2';
                charArr[index-3]='%';
                index = index-3;
            }
            else{
                charArr[index-1]=charArr[i];
                index--;
            }
        }
        System.out.println(charArr);
    }
}
