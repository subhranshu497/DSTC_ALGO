package com.sorting;

public class MergeSort {
    public static void main(String[] args) {
        int [] nums = {38,27,43,10};
        int [] sortedArr = mergeSort(nums);
        for(int num:sortedArr)
            System.out.print(num+", ");
    }

    /**
     * step 1 - divide the arr by calculating mid = l+(r-l)/2
     * stop once the arr contain 1 element
     * start the merge process
     * compare the ellment from arr1 with arr2, and sort in ascending order.
     * once either array is out of bound, copy all the elment of other array as is
     * @param nums
     * @return
     */

    private static int[] mergeSort(int[] nums) {
        mergeSortRecursion(nums, 0, nums.length-1);
        return nums;
    }

    private static void mergeSortRecursion(int[] nums, int l, int r) {
        //base condition
        if(l>=r) return;
        //calculate mid
        int mid = l+(r-l)/2;
        mergeSortRecursion(nums, l,mid);
        mergeSortRecursion(nums, mid+1, r);

        mergeLogic(nums, l, r, mid);
    }

    private static void mergeLogic(int[] nums, int l, int r, int mid) {
        int n1 = mid - l+1;
        int n2 = r-(mid+1)+1;
        int [] left = new int[n1];
        int [] right = new int[n2];
        int k =l;
        for(int i=0;i<n1;i++){
            left[i] = nums[k];
            k++;
        }
        for(int i=0;i<n1;i++){
            right[i] = nums[k];
            k++;
        }
        int i=0;
        int j=0;
        k=l;
        while(i<n1 && j<n2){
            if(left[i] <= right[j]){
                nums[k] = left[i];
                i++;
            }
            else{
                nums[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            nums[k] = left[i];
            i++;
            k++;
        }
        while(j < n2){
            nums[k] = right[j];
            j++;
            k++;
        }
    }
}
