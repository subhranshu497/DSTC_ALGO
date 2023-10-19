package com.dynamicProgramming;

import java.util.Random;

/***
 * to find out K-th smallest or K-th largest element in an unsorted array
 * Partition phase
 * selection phase
 * find pivot in random manner in the array
 * partion the array based on pivot, all element < pivot, in the left side of the array
 * All element > pivot, on the right side of the array
 */
public class QuickSelect {
    int [] nums;

    public QuickSelect(int[] nums) {
        this.nums = nums;
    }
    public int quickSelectCall(int k) {
        return quickSelectImpl(0,nums.length-1,k-1);
    }
    private int quickSelectImpl(int firstIndex, int lastIndex, int k) {
        int pivot = partition(firstIndex,lastIndex);
        if(pivot < k){
            //discard the left
            // focus on right
            return quickSelectImpl(pivot+1, lastIndex,k);
        }
        else if(pivot > k){
            return quickSelectImpl(firstIndex, pivot-1, k);
        }
        return nums[pivot];
    }

    private int partition(int firstIndex, int lastIndex) {
        int pivot = new Random().nextInt(lastIndex-firstIndex+1)+firstIndex;
        swap(pivot, lastIndex);
        for(int i=firstIndex;i<lastIndex;i++){
            if(nums[i]>nums[pivot]){
                swap(i,firstIndex);
                firstIndex++;
            }
        }
        return firstIndex;
    }

    private void swap(int pivot, int lastIndex) {
        int temp = nums[pivot];
        nums[pivot] = nums[lastIndex];
        nums[lastIndex] = temp;
    }
}
