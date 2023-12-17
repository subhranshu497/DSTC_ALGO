package com.leetcode.practice;

public class CalculateMoneyInLeetcodeBank {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(totalMoney(n));
    }

    private static int totalMoney(int n) {
        int weeks = n/7; //2
        int result = solve(weeks);
        int remainingDays = n %7;
        if(remainingDays ==0)  return result;
        else{
            int current = weeks +1;
            while(remainingDays > 0){
                result += current;
                current++;
                remainingDays--;
            }
        }
        return result;
    }

    private static int solve(int weeks) {
        int total=0;
        for(int i=0;i<weeks;i++){
            total += 28 + (i*7);
        }
        return total;
    }
}
