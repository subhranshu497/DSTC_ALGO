package com.leetcode.practice;

import java.util.PriorityQueue;

public class SeatReservationManager {

    PriorityQueue<Integer> seats;
    /**
     * its a problem of MinHeap
     * @param n
     */
    public SeatReservationManager(int n){
        //assigneing seats
        seats = new PriorityQueue<>();
        for(int i=1;i<=n;i++){
            seats.offer(i);
        }
    }
    public int reserve() {
        return seats.poll();
    }

    public void unreserve(int seatNumber) {
        seats.offer(seatNumber);
    }
}
