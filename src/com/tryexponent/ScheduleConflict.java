package com.tryexponent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ScheduleConflict {
    public static void main(String[] args) {
        int schedule [][] = {{2,3}, {1,2}, {3,5}, {4,6}};
        // output - {3,5}, {4,6}
        int [][] result = scheduleConflictChecker(schedule);
        for(int i =0;i<result.length;i++){
            System.out.println("{"+result[i][0]+", "+result[i][1]+"}");
        }
    }

    private static int[][] scheduleConflictChecker(int[][] schedule) {
        //first sort the array based on start time
        Arrays.sort(schedule, Comparator.comparingInt(i->i[0]));
        // {1,2}, {2,3},{3,5}, {4,6}
        List<int[]> finalResult = new ArrayList<>();
        for(int i=1; i<schedule.length;i++){
            if(schedule[i][0]<schedule[i-1][1]){
                finalResult.add(schedule[i]);
                finalResult.add(schedule[i-1]);
            }
        }
        return finalResult.toArray(new int[finalResult.size()][]);
    }
}
