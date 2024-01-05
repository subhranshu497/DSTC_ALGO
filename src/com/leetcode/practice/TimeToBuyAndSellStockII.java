package com.leetcode.practice;

public class TimeToBuyAndSellStockII {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int total = 0;
        int peak = Integer.MAX_VALUE;
        int valley = peak;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<peak){
                total += peak-valley;
                valley = prices[i];
                peak = valley;
            }
            else {
                peak = prices[i];
            }
            total += peak - valley;
        }
        return total;
    }
}
