package com.leetcode.seventyfive;


public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowers = {1,0,0,0,1};
        int n =2;
        System.out.println(canPlaceFlowr(flowers,n));
    }

    private static boolean canPlaceFlowr(int[] flowers, int n) {
        int count = 0;
        for(int i=0; i<flowers.length-1;i++){
            if(flowers[i]==0){
                boolean checkLeft = (i==0) || flowers[i-1]==0;
                boolean checkRight = (i==flowers.length-1) || flowers[i+1]==0;
                if(checkLeft && checkRight){
                    count++;
                    flowers[i]=1;
                }
            }
        }
        return count >=n;
    }
}
