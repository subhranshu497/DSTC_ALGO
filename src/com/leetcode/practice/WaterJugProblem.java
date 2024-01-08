package com.leetcode.practice;


import com.sun.source.doctree.SeeTree;
import datastructures.Queue.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

//Leetcode #365
public class WaterJugProblem {
    public static void main(String[] args) {
        int jug1 = 3;
        int jug2 = 5;
        int target = 4;
        System.out.println(canMeasureWater(jug1, jug2, target));
    }

    private static boolean canMeasureWater(int x, int y, int z) {
        Deque<Integer> q = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();
        if(x+y < z) return false;
        int[] directions = {x,-x,y,-y};
        q.offer(0);
        visited.add(0);
        while(!q.isEmpty()){
            int curr = q.poll();
            if(curr == z) return true;
            for(int direction:directions){
                int total = curr+direction;
                if(total ==z) return true;
                if(total<0 || total >x+y) continue;
                if(!visited.contains(total)){
                    visited.add(total);
                    q.offer(total);
                }
            }
        }
        return false;
    }
}
