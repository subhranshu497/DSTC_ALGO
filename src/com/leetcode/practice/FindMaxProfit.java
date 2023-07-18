package com.leetcode.practice;

public class FindMaxProfit {
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        System.out.println(maxProfitFinder(prices));
    }

    private static int maxProfitFinder(int[] prices) {
        int max_profit = 0;
        int buy = prices[0];
        for(int i=0;i<prices.length;i++){
            if(buy > prices[i]){
                buy = prices[i];
            }
            else if((prices[i]-buy)>max_profit){
                max_profit = prices[i] - buy;
            }
        }
        return max_profit;
    }
}
