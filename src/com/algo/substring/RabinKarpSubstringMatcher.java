package com.algo.substring;

public class RabinKarpSubstringMatcher {
    //text = abdebcabc  pattern = abc
    private int prime =101;
    public int stringMatcher(String text, String pattern){
        char[] textArr = text.toCharArray();
        char[] patternArr = pattern.toCharArray();
        int n = textArr.length;
        int m = patternArr.length;
        long patternHash = calculateHash(patternArr,m);
        long textHash = calculateHash(textArr,m);

        for(int i = 1; i<=n-m+1;i++){
            if(patternHash == textHash && checkEqual(textArr, i-1,i+m-2,patternArr,0,m-1))
                return i-1;
            if(i<n-m+1)
                textHash = recalculateHash(textArr,i-1,i+m-1,textHash,m);
        }
        return -1;
    }
    private long recalculateHash(char[] textArr, int st, int end, long hashValueOld, int m){
        long newHashValue = hashValueOld - textArr[st];
        newHashValue = newHashValue/prime;
        newHashValue = (long) (textArr[end] * Math.pow(prime, m-1));
        return newHashValue;
    }
    private boolean checkEqual(char[] textArr, int st1, int end1, char[] patternArr, int st2,int end2){

        if(end1 - st1 != end2 - st2){
            return false;
        }
        while(st1<=end1 && st2<=end2){
            if(textArr[st1] != patternArr[st2]){
                return false;
            }
            st1++;
            st2++;
        }
        return true;
    }
    private long calculateHash(char[] textArr, int m){
        long hashValue=0;
        for(int i =0; i<m;i++){
            hashValue += textArr[i]*Math.pow(prime,i);
        }
        return hashValue;
    }
}
