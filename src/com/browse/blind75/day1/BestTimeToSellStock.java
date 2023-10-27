package com.browse.blind75.day1;

public class BestTimeToSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = prices[0];
        for(int i=0;i<prices.length;i++){
            if(buy>prices[i]) buy = prices[i];
            else if(prices[i]-buy >maxProfit) maxProfit = prices[i]-buy;
        }
        return maxProfit;
    }
}
