package com.leetcode.practice;

import java.util.Arrays;

public class BuyTwoChocolates {
    public static void main(String[] args) {
        int [] prices = {1,2,2};
        int money = 3;
        System.out.println(buyChoco(prices, money));
    }

    private static int buyChoco(int[] prices, int money) {
        int debt = 0;
        Arrays.sort(prices);
        if(prices[0]+prices[1] <= money) debt = money - (prices[0]+prices[1]);
        else debt = money;

        return debt;
    }
    // with O(n) time complexity
    private static int buyChocolates(int[] prices, int money){
        //first find the minindex
        int firstMinindex = minIndex(prices);
        int firstMin = prices[firstMinindex];
        prices[firstMinindex] = Integer.MAX_VALUE;

        int secondMinindex = minIndex(prices);
        int secondMin = prices[secondMinindex];
        if(firstMin+secondMin <= money) return money - (firstMin+secondMin);
        else return money;

    }
    private static int minIndex(int[] prices){
        int minIndex = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i] < prices[minIndex]) minIndex =i;
        }
        return minIndex;
    }
}
