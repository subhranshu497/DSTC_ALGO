package com.leetcode.daily;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static com.leetcode.daily.SubarraySumEqualK.subArraySum;

public class NumberofSubmatricesThatSumtoTarget {
    public static void main(String[] args) {
        int target = 0;
        int[][] matrix = {{0,1,0},{1,1,1},{0,1,0}};
        System.out.println(numSubmatrixSumTarget(matrix, target));
    }

    private static int numSubmatrixSumTarget(int[][] matrix, int target) {
        int count =0;
        int row = matrix.length;
        int col = matrix[0].length;
        int [] summedRow = new int[col];
        for(int i1=0;i1<row;i1++){
            Arrays.fill(summedRow,0);
            for(int i2=i1;i2<row;i2++){
                for(int j=0;j<col;j++){
                    summedRow[j] +=matrix[i2][j];
                }
                count += subArraySumToTarget(summedRow,target);
            }
        }
        return count;
    }
    private static int subArraySumToTarget(int [] nums, int k){
        int count =0;
        int sum =0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int num : nums){
            sum +=num;
            if(map.containsKey(sum-k))count +=map.get(sum-k);
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}
