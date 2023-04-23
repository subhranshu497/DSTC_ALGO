package com.algo.bitManipulation;

public class GetBitAlgo {
    /**
     * get ith bit of the given number (number implicitly converted to binary)
     * @param args
     */
    public static void main(String[] args) {
        int num= 5;
        int i = 5;

        //first do left shift of the num ith times
        int result = 1<<i;
        if((result & num)==0) {
            System.out.println("the bit was Zero");
        }
        else{
            System.out.println("The bit was One");
        }
    }
}
