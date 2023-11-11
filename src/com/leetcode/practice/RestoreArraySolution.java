package com.leetcode.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestoreArraySolution {
    public static void main(String[] args) {
        int[][] adjacentPairs = {{2,1},{3,4},{3,2}};
        restreArray(adjacentPairs);
    }

    private static int[] restreArray(int[][] adjacentPairs) {
        Map<Integer, ArrayList<Integer>> graph = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        //populate the hasmap
        for(int[] pair: adjacentPairs){
            graph.computeIfAbsent(pair[0], v -> new ArrayList<>()).add(pair[1]);
            graph.computeIfAbsent(pair[1], v -> new ArrayList<>()).add(pair[0]);
        }
        // iterate the map to get the key whose value length is one, that is the edge

        for(Map.Entry<Integer, ArrayList<Integer>> entry : graph.entrySet()){
            if(entry.getValue().size() == 1){
                result.add(entry.getKey());
                result.add(entry.getValue().get(0));
                break;
            }
        }
        // populate the result by iterating the hashmap
        while (result.size() < adjacentPairs.length+1){
            int last = result.get(result.size()-1);
            int prev = result.get(result.size()-2);
            List<Integer> candidate = graph.get(last);
            int nextElement = candidate.get(0) != prev ? candidate.get(0) : candidate.get(1);
            result.add(nextElement);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
