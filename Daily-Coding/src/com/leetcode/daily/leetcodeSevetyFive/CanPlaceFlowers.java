package com.leetcode.daily.leetcodeSevetyFive;

//leetcode problem # 605
public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerBed = {1,0,0,0,0,0,1};
        int n = 2;
        System.out.println(canPlaceFlower(flowerBed, n));
    }

    private static boolean canPlaceFlower(int[] flowerBed, int n) {
        int count=0;
        for(int i=0;i<flowerBed.length;i++){
            if(flowerBed[i]==0){
                boolean emptyLeft = (i==0)|| flowerBed[i-1]==0;
                boolean emptyRight = (i==flowerBed.length-1) || (flowerBed[i+1]==0);
                if(emptyRight && emptyLeft){
                    flowerBed[i] =1;
                    count++;
                }
            }
        }
        return count >=n;
    }
}
