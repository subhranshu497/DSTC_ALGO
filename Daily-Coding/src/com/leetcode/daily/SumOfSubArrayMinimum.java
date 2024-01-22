package com.leetcode.daily;

import java.util.Stack;

public class SumOfSubArrayMinimum {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        System.out.println(sumSubArrayMin(arr));
    }

    private static int sumSubArrayMin(int[] arr) {
        int[] nextSmall = nextSmaller(arr);
        int[] prevSmall = prevSmall(arr);
        int mod = 1000000007;
        long count =0;
        for(int i =0;i<arr.length;i++){
            int first = i - prevSmall[i];
            int second = nextSmall[i] - i;
            int prod = (first*second) % mod;
            count = (count%mod + prod) % mod;
        }
        return (int)count;
    }
    private static int[] nextSmaller(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        for(int i = arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()) ans[i] =arr.length;
            else arr[i] = stack.peek();
            stack.push(i);
        }
        return ans;
    }
    private static int[] prevSmall(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()) ans[i] =arr.length;
            else arr[i] = stack.peek();
            stack.push(i);
        }
        return ans;
    }

    // alt solution
    public int sumSubarrayMins(int[] arr) { // int[] arr = {3,1,2,4};
        int MOD = 1000000007;

        Stack<Integer> stack = new Stack<>();
        long sumOfMinimums = 0;

        // building monotonically increasing stack
        for (int i = 0; i <= arr.length; i++) {

            // when i reaches the array length, it is an indication that
            // all the elements have been processed, and the remaining
            // elements in the stack should now be popped out.
            //i = 0 , stack [0,  //i =1 . stack = [0  ] mid = 0 , left =-1 , count = 1 * 1 = 1
            while (!stack.empty() && (i == arr.length || arr[stack.peek()] >= arr[i])) {

                // Notice the sign ">=", This ensures that no contribution
                // is counted twice. rightBoundary takes equal or smaller
                // elements into account while leftBoundary takes only the
                // strictly smaller elements into account

                int mid = stack.pop();
                int leftBoundary = stack.empty() ? -1 : stack.peek();
                int rightBoundary = i;

                // count of subarrays where mid is the minimum element
                long count = (mid - leftBoundary) * (rightBoundary - mid) % MOD;

                sumOfMinimums += (count * arr[mid]) % MOD;
                sumOfMinimums %= MOD;
            }
            stack.push(i);
        }

        return (int) (sumOfMinimums);
    }
}
