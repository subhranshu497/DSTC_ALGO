package com.dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class FibonacciIteration {
    public static void main(String[] args) {
        int n =7;
        iterFib(n);
    }

    private static void iterFib(int n) {

        List<Integer> sum = new ArrayList<>();
        int f1 = 0;
        sum.add(f1);
        int f2 = 1;
        sum.add(f2);

        for(int i=2;i<=n;i++){
            int f = f2;
            f2 = f1+f2;
            f1 = f;
            sum.add(f2);
        }
        System.out.println(sum);
    }
}
