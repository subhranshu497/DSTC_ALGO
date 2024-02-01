package com.leetcode.daily;

import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        int [] results = dailyTempe(temperatures);
        for(int i=0;i< results.length;i++){
            System.out.print(results[i]+", ");
        }
    }

    private static int[] dailyTempe(int[] temperatures) {
        int [] results = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=temperatures.length-1;i>=0;i--){
            while(!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]){
                    stack.pop();
            }
             if(!stack.isEmpty()) {
                results[i]=stack.peek()-i;
            }
                stack.push(i);
        }
        return results;
    }
}
