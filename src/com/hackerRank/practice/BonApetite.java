package com.hackerRank.practice;

import java.util.ArrayList;
import java.util.List;

public class BonApetite {
    public static void main(String[] args) {
        List<Integer> bill = new ArrayList<>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);
        int k = 1;
        int totalBill = 12;

        calculateBill(bill,k,totalBill);
    }

    private static void calculateBill(List<Integer> bill, int k, int totalBill) {
        int sum = 0;
        for(int i =0;i<bill.size();i++){
            if(i == k) continue;
            sum +=bill.get(i);
        }
        if(sum/2 == totalBill) System.out.println("Bon Appetit");
        else System.out.println(totalBill - (sum/2));
    }
}
