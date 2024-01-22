package com.leetcode.daily;

import java.util.*;

public class FindPlayersWithZeroorOneLosses {
    public static void main(String[] args) {
        int[][] matches = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
        List<List<Integer>> results = findWinners(matches);
        System.out.println(results);
    }

    private static List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> allTeam = new HashSet<>();
        Set<Integer> losers = new HashSet<>();
        Set<Integer>nonLosers = new HashSet<>();
        Set<Integer>oneMatchLoser = new HashSet<>();
        List<List<Integer>> results = new ArrayList<>();
        Map<Integer, Integer> loserMap = new HashMap<>();
        for(int i=0;i<matches.length;i++){
            allTeam.add(matches[i][0]);
            allTeam.add(matches[i][1]);
            losers.add(matches[i][1]);
            loserMap.put(matches[i][1],loserMap.getOrDefault(matches[i][1],0)+1);
        }
        //winner team who never lost a match
        for(int winnerTeam:allTeam){
            if(!losers.contains(winnerTeam)) nonLosers.add(winnerTeam);
        }
        //team who lost one match
        for(int key: loserMap.keySet()){
            if(loserMap.get(key)==1)oneMatchLoser.add(key);
        }
        List<Integer> winner = new ArrayList<>(nonLosers);
        Collections.sort(winner);
        List<Integer> oneGameLoser = new ArrayList<>(oneMatchLoser);
        Collections.sort(oneGameLoser);
        results.add(winner);
        results.add(oneGameLoser);
        return results;
    }
}
