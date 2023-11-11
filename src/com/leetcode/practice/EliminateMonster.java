package com.leetcode.practice;

import java.util.Arrays;

public class EliminateMonster {
    public static void main(String[] args) {
        int[] dist = {1,3,4};
        int[] speed = {1,1,1};
        System.out.println(findMonsterCount(dist, speed));

    }

    private static int findMonsterCount(int[] dist, int[] speed) {
        // calculate the number of monsters
        int monsters = dist.length;
        // calculate time taken by each monster to reach the city, assuming if the monster reaches the city during
        // the weapon is on charge, then its loss
        // so subtract 1 from the distance, as it is the waiting timw for the warrior
        int [] times = new int[monsters];
        for(int i=0; i<monsters;i++){
            times[i] =(dist[i]-1)/speed[i];
        }
        // sort the time array in increasing order, so that warrior can fight with them
        Arrays.sort(times);
        // if the time taken by the monster is greater than the index, then monster wins retrn the count
        for(int time=1; time< times.length;time++){
            if(times[time] < time){
                return time;
            }
        }
        return monsters;
    }
}
