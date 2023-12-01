package com.leetcode.practice;

public class DivideALongCorridor {
    public static void main(String[] args) {
        String corridor = "SSPPSPS";
        System.out.println(divideCorridor(corridor));
    }

    private static int divideCorridor(String corridor) {
        char[] arr = corridor.toCharArray();
        int n = arr.length;
        int chairs =0;
        long result =1;
        int mod = 10000007;
        for(int i=0;i<n;i++){
            if(arr[i]=='S'){
                chairs++;
                while(++i<n && arr[i] !='S');
                if(i<n && arr[i]=='S'){
                    chairs++;
                }
                int div =1;
                while(++i<n && arr[i] !='S'){
                    div++;
                }
                if(div >1 && i<n){
                    result = (result*div)%mod;
                }
                i--;
            }
        }
        return (chairs !=0 && chairs % 2 == 0)?(int)result:0;
    }
}
