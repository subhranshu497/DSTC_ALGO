package com.leetcode.daily;

public class OutOfBoundary {
    private static Long[][][] memo = null;
    private static int mod = 1000000007;
    public static void main(String[] args) {
        int m=2;
        int n=2;
        int maxMove=2;
        int startRow =0;
        int startCol =0;
        System.out.println(findPaths(m,n,maxMove,startRow,startCol));
    }

    public static int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        memo = new Long[m + 1][n + 1][maxMove + 1];
        return (int)(findPathsMemoHelper(m, n, maxMove, startRow, startColumn));
    }

    public static long findPathsMemoHelper(int m, int n, int maxMove, int row, int col) {


        if (maxMove < 0) {
            return 0;
        }

        // boundary condition
        if (row == m || col == n || row < 0 || col <0) {
            return 1;
        }


        if (memo[row][col][maxMove] != null)
            return memo[row][col][maxMove];

        long total = 0;
        long left_maxMoveReduced = findPathsMemoHelper(m, n, maxMove - 1, row, col - 1);
        long right_maxMoveReduced = findPathsMemoHelper(m, n, maxMove - 1, row, col + 1);
        long up_maxMoveReduced = findPathsMemoHelper(m, n, maxMove - 1, row - 1, col);
        long down_maxMoveReduced = findPathsMemoHelper(m, n, maxMove - 1, row + 1, col);

        total =  (( left_maxMoveReduced + right_maxMoveReduced + down_maxMoveReduced + up_maxMoveReduced) % mod);
        memo[row][col][maxMove] = total;
        return total;
    }
}
