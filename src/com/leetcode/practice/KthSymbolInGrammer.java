package com.leetcode.practice;

public class KthSymbolInGrammer {
    public static void main(String[] args) {
        System.out.println(kthGrammarrecursion(2,1));
    }

    /**
     *
     * @param n no of row
     * @param k th index in the given row
     * @return value of kth index
     */
    private static int kthGrammar(int n, int k) {
        //base confition
        if(n==1 && k==1) return 0;

        int mid= (int) (Math.pow(2,n-1)/2);
        if(k <=mid){
            return kthGrammar(n-1,k);
        }
        else{
            int x = kthGrammar(n-1, k-mid);
            if(x==0) return 1;
            else return 0;
        }
    }
    //iterative approach
    private static int kthGrammarrecursion(int n, int k) {
        boolean flag = true;
        int mid = (int) Math.pow(2,n-1);

        while (mid !=1){
            mid = mid/2;
            if(k>mid){
                k = k-mid;
                flag = !flag;
            }
        }
        return (flag?0:1);
    }
}
