package com.dynamicProgramming;

public class RussianPeasantMultiPlication {
    public static void main(String[] args) {
        System.out.println(multiplyRecursion(3,5));
    }

    private static int multiply(int a, int b) {
        int result = 0;
        while (b>0){
            //odd check for b
            if((b^1)==b-1) result =result+a;

            //increament a and double it
            a=a << 1;
            //decreament a and reduce it to half of the original number
            b=b>>  1;
        }
        return result;
    }

    private static int multiplyRecursion(int a, int b){
        //base case
        if(b==1) return a;
        //check and return for odd number
        if((b^1)==b-1) return a+multiplyRecursion(a<<1,b>>1);
        else return multiplyRecursion(a<<1,b>>1);
    }
}
