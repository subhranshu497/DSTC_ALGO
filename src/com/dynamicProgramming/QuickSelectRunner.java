package com.dynamicProgramming;

public class QuickSelectRunner {
    public static void main(String[] args) {
        int [] nums = {1,-2,5,8,7,6};
        QuickSelect qs = new QuickSelect(nums);
        System.out.println(qs.quickSelectCall(2));
    }
}
