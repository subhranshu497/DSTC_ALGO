package com.udemyLearning.arrays;

public class FindPeak {
    public static void main(String[] args) {
        int [] arr= {1, 3, 20, 4, 1, 90};//{2,33,2,51};
        int n = arr.length;
        //peakElement(arr);
        int ele = findPeakBinaryRecursion(arr,n);
        System.out.println("Peak is "+arr[ele]);
    }

    private static int findPeakBinaryRecursion(int[] arr, int n) {
        return findPeakUtil(arr, 0, n-1, n);

    }

    private static int findPeakUtil(int[] arr, int low, int high, int n) {
        int mid = low + (high-low)/2;
        //check mid is the peak element
        if((mid ==0 || arr[mid-1]<= arr[mid]) && (mid==n-1 || arr[mid+1]<=arr[mid])) return mid;
        //check left part has the peak
        else if(mid >0 && arr[mid-1]>arr[mid]) return findPeakUtil(arr,low,mid-1,n);
        //check right part of the arr
        else return findPeakUtil(arr,(mid+1),high,n);
    }

    private static void peakElement(int[] arr) {
        int len = arr.length;
        if(len ==1){
            System.out.println("Peak is "+arr[0]);
        }
        else if(arr[0]> arr[1]){
            System.out.println("Peak is "+arr[0]);
        }
        else if(arr[len-1]>arr[len-2]){
            System.out.println("Peak is "+arr[len-1]);
        }
        else{
            for(int i=1;i<len-1;i++){
                if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                    System.out.println("Peak is "+arr[i]);
                    break;
                }
            }
        }
    }
}
