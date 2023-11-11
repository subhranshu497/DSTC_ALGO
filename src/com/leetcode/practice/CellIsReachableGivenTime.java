package com.leetcode.practice;

public class CellIsReachableGivenTime {
    public static void main(String[] args) {
        System.out.println(isReachableAtTime(3,1,7,3,3));
    }

    public static boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        //find the diagonal distance
        int xDiff = Math.abs(sx-fx);
        int yDiff = Math.abs(sy-fy);

        //edge case
        if(xDiff == 0 && yDiff == 0 && t == 1) return false;

        return Math.abs(xDiff - yDiff) + Math.min(xDiff, yDiff) <= t;
    }
}
