package com.datastructure.priorityQueue;

import java.util.PriorityQueue;

public class KthLargest {
    private static int k;
    private PriorityQueue<Integer> heap;

    public KthLargest(int k, int [] nums){
        this.k = k;
        heap = new PriorityQueue<>();
        for(int num:nums){
            heap.offer(num);
        }
        while(heap.size()>k) heap.poll();
    }
    public int add(int num){
        heap.offer(num);
        if(heap.size()>k){
            heap.poll();
        }
        return heap.peek();
    }
}
