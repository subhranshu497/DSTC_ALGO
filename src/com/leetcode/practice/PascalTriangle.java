package com.leetcode.practice;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 4;
        generateTriangle(numRows);
    }

    private static List<Integer> generateTriangle(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        //if(numRows ==0) return 0;
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        for(int i=1;i<numRows;i++){
            List<Integer> prevRow = triangle.get(i-1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++){
                row.add(prevRow.get(j-1)+prevRow.get(j));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle.get(numRows);
    }
}
