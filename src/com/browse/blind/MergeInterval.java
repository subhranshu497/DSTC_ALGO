package com.browse.blind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int [][] result = mergeIntervalImpl(intervals);
    }

    private static int[][] mergeIntervalImpl(int[][] intervals) {
        // sort the array based on the first index of every interval
        Arrays.sort(intervals, Comparator.comparingInt(i->i[0]));
        //keep on camparing the second index of prev > first index of curr, if 2nd index of prev is greater
        // then form the result array with first index of prev and 2nd index of curr
        List<int[]> result = new ArrayList<>();
        int[]newInterval = intervals[0];
        result.add(newInterval);
        for(int[] interval : intervals){
            if(newInterval[1]>=interval[0]){
                newInterval[1] = Math.max(newInterval[1],interval[1]);
            }
            else{
                newInterval = interval;
                result.add(newInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
