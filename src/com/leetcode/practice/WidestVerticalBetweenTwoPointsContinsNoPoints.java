package com.leetcode.practice;

import java.util.Arrays;

public class WidestVerticalBetweenTwoPointsContinsNoPoints {
    public static void main(String[] args) {
        int[][] points = {{3,1},{9,0},{1,0},{1,4},{5,3},{8,8}};
        int result = maxWidthOfVerticalArea(points);
        System.out.println(result);
    }

    private static int maxWidthOfVerticalArea(int[][] points) {
        int maxWidth = 0;
        // sotring the points based on x coordinates
        Arrays.sort(points, (a,b)->Integer.compare(a[0],b[0]));
        for(int i=1; i<points.length;i++){
            maxWidth = Math.max(maxWidth, points[i][0]-points[i-1][0]);
        }
        return maxWidth;
    }
}
