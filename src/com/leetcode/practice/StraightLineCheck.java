package com.leetcode.practice;

public class StraightLineCheck {
    public static void main(String[] args) {
       int[][] coordinates = {{1,2},{2,3},{3,4},{4,5},{4,6},{6,7}};
        System.out.println(straightLineChecker(coordinates));
    }

    private static boolean straightLineChecker(int[][] coordinates) {
        int deltaY = getDeltaY(coordinates[1],coordinates[0]);
        int deltaX= getDeltaX(coordinates[1],coordinates[0]);

        for(int i=2;i<coordinates.length;i++){
//            int deltaYRun = getDeltaY(coordinates[i],coordinates[0]);
//            int deltaXRun = getDeltaX(coordinates[i],coordinates[0]);
            //slope check
            if((deltaY*(getDeltaX(coordinates[i],coordinates[0]))) != (deltaX*(getDeltaY(coordinates[i],coordinates[0])))) return false;
        }
        return true;
    }

    private static int getDeltaX(int[] x1, int[] x0) {
        return x1[0] -x0[0];
    }
    private static int getDeltaY(int[] y1, int[] y0) {
        return y1[1]-y0[1];
    }
}
