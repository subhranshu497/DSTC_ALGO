package com.leetcode.practice;

public class PoorPig {
    public static void main(String[] args) {
        int timeToDie = 15;
        int timeToTest =15;
        int buckets = 4;
        System.out.println(findMinPig(timeToTest,timeToDie,buckets));
    }

    private static int findMinPig(int timeToTest, int timeToDie, int buckets) {
        if(buckets--==1) return 0;
        // no of iteration are needed
        int iter = timeToTest / timeToDie+1;
        int pig =0;
        while(buckets >0){
            buckets = buckets /iter;
            pig +=1;
        }
        return pig;
    }
}
