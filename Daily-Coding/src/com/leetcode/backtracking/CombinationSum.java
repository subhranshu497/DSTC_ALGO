package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidate = {2,3,6,7};
        int target = 7;
        List<List<Integer>> ans = combinationSum(candidate, target);
        System.out.println(ans);
    }

    private static List<List<Integer>> combinationSum(int[] candidate, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0, candidate, target, ans, new ArrayList<>());
        return ans;
    }

    private static void findCombination(int i, int[] candidate, int target, List<List<Integer>> ans, List<Integer> ds) {
        //base condition
        if(i == candidate.length){
            if(target ==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        //pick condition
        if(candidate[i]<=target){
           ds.add(candidate[i]);
           findCombination(i, candidate, target-candidate[i], ans, ds);
           ds.remove(ds.size()-1);
        }
        //not pick
        findCombination(i+1, candidate, target, ans, ds);
    }
}
