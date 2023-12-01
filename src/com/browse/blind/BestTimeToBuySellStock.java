package com.browse.blind;

public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        int[] prices = {2,1,4};
        System.out.println(calculateStockPrice(prices));
    }

    private static int calculateStockPrice(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy) buy = prices[i];
            else if(prices[i]-buy > profit) profit = prices[i] - buy;
        }
        return profit;
    }
}
