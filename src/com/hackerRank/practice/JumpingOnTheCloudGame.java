package com.hackerRank.practice;

import java.util.ArrayList;
import java.util.List;

public class JumpingOnTheCloudGame {
    public static void main(String[] args) {
        List<Integer> c = new ArrayList<>();
        c.add(0);
        c.add(1);
        c.add(0);
        c.add(0);
        c.add(0);
        c.add(1);
        c.add(0);
        System.out.println(jumpingOnTheCloud(c));
    }

    private static int jumpingOnTheCloud(List<Integer> c) {
        int ans = 0;
        int n = c.size();
        for(int i=0; i < n; i+=2){
            if (i==n-1)
                break;
            if (i==n-2||c.get(i+2)==1) {
                i++;
                ans++;
            }
            if (i==n-1)
                break;
            ans++;
        }
        return ans;
    }

}
