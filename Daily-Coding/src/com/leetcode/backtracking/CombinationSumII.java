package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Leetcode # 40
 */
public class CombinationSumII {
    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> ans = combinationSum2(candidates, target);
        System.out.println(ans);
    }

    private static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombination2(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }

    private static void findCombination2(int index, int[] candidates, int target, List<Integer> ds, List<List<Integer>> ans) {
        //base condition
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i =index; i< candidates.length;i++){
            if(i>index && candidates[i] == candidates[i-1]) continue;
            if(candidates[i]>target) break;
            ds.add(candidates[i]);
            findCombination2(i+1, candidates, target-candidates[i], ds, ans);
            ds.remove(ds.size()-1);
        }
    }
}
