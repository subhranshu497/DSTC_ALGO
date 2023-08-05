package com.leetcode.practice;

public class FindMinSpeed {
    public static void main(String[] args) {
        int[] dist = {1,3,2};
        double hour = 6.0;
        //System.out.println(findMinimumSpeed(dist, hour));
        calc();
    }

    /***
     * find minimum speed between home and office.
     * there are multiple hopping point
     * time taken to travel from one hopping point to other should be round up to integer
     * but the time taken from last hopping point to office should be taken AS-IS
     * @param dist
     * @param hour
     */
    private static int findMinimumSpeed(int[] dist, double hour) {
        int start = 0;
        int len = dist.length;
        int end = len-1;
        int minSpeed = -1;
        while(start <=end){
            int mid = start + (end-start)/2;
            if(isPossible(dist,mid,hour)){
                minSpeed = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return minSpeed;
    }

    private static boolean isPossible(int[] dist, int mid, double hour) {
        double res = 0;
        for(int i=0;i<dist.length;i++){
            double t = dist[i]*1.0/mid; //BADMAS
            if(i != (dist.length-1)){
                res += Math.ceil(t);
            }
            else{
                res +=t;
            }
            if(res > hour) return false;
        }
        return res<=hour;
    }
    public static void calc(){
        double a = 1;
        double b =0;
        double c = a*1.0/b;
        System.out.println(c);
    }
}
