package com.recursion;

public class factorial {
    public static void main(String[] args) {
        int num =5;
        System.out.println(factorialCal(num));
    }

    private static int factorialCal(int num) {
        int result=1;
        //base condition
        if(num ==0 || num==1) return 1;
        return num * factorialCal(num-1);
    }
}
