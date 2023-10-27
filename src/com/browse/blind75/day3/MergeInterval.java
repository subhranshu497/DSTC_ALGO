package com.browse.blind75.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeInterval {
    public static void main(String[] args) {
        int [][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int [][] result = merge(intervals);
    }

    private static int[][] merge(int[][] intervals) {
        //sort the intervl array by the first index of every interval
        Arrays.sort(intervals,Comparator.comparingInt(i->i[0]));
        //logic is keep on comparing the 2nd index of prev > the first index of next
        // then take the max between 2nd index of prev and 2nd index of first. Then assign as 2nd index of result
        List<int[]> result = new ArrayList<>();
        int[] newInterval = intervals[0];
        result.add(newInterval);
        for(int[] interval:intervals){
            if(newInterval[1]>=interval[0]){
                newInterval[1] = Math.max(interval[1], newInterval[1]);
                result.add(newInterval);
            }
            else {
                newInterval = interval;
                result.add(newInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
