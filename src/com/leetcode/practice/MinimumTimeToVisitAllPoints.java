package com.leetcode.practice;

public class MinimumTimeToVisitAllPoints {
    public static void main(String[] args) {
        int[][] points = {{1,1},{3,4},{-1,0}};
        System.out.println(minTimeToVisitAllPoints(points));
    }

    private static int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for(int i = 1; i<points.length;i++){
            time += calculteTime(points[i-1],points[i]);
        }
            return time;
    }
    private static int calculteTime(int[] from, int[] to){
        int xDiff = Math.abs(from[0] -to[0]);
        int yDiff = Math.abs(from[1] - to[1]);

        return Math.max(xDiff, yDiff);
    }
}
