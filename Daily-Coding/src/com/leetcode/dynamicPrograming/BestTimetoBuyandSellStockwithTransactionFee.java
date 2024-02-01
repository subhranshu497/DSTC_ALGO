package com.leetcode.dynamicPrograming;

public class BestTimetoBuyandSellStockwithTransactionFee {
    public static void main(String[] args) {
        int[] prices = {1,3,7,5,10,3};
        int transactionFee =2;
        System.out.println(maxProfit(prices, transactionFee));
    }

    private static int maxProfit(int[] prices, int transactionFee) {
        int profit =0;
        int effectiveBuyPrice = prices[0];
        for(int i=1;i<prices.length;i++){
            profit = Math.max(profit, prices[i]-effectiveBuyPrice-transactionFee);
            effectiveBuyPrice = Math.min(effectiveBuyPrice,prices[i]-profit);
        }
        return profit;
    }
}
