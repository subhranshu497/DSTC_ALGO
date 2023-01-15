package com.algo.basic;

public class FindANumber {
    public static void main(String[] args) {
        int x = 881;
        int n = 1000;
        int count =0;
       boolean isEven = x % 2 ==0;
        long start=System.currentTimeMillis();
        if(x>0) {
            System.out.println("X is "+x);
            if (isEven) {
                System.out.println("IsEven");
                for (int i = 0; i < n; i = i + 2) {
                    count++;
                    if (i == x) {
                        System.out.println("Number found after " + count + "th try");
                        break;
                    }
                }
            } else {
                for (int i = 1; i < n; i = i + 2) {
                    count++;
                    if (i == x) {
                        System.out.println("Number found after " + count + "th try");
                        break;
                    }
                }
            }
        }
        else{
            System.out.println("Please enter a valid number");
        }
//        for (int i =0;i<n;i++){
//            if(i==x){
//                System.out.println("Number found after "+i+"th try");
//            }
//        }

        long end = System.currentTimeMillis();
        long total = end -start;
        System.out.println("Total Exe Time is "+ total+" ms");

    }
}
