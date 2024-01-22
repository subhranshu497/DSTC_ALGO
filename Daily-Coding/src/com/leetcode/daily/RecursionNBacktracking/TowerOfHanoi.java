package com.leetcode.daily.RecursionNBacktracking;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n =3;
        towerOfHanoiRecursion(n,'A','C','B');

    }

    /**
     *
     * @param n= number of disk
     *          disk 1 = small
     *          disk 2 = medium
     *          disk 3 = large
     */
    private static void towerOfHanoiRecursion(int n, char origin, char destination, char buffer) {
        //base condition
        if(n == 0) return;
        towerOfHanoiRecursion(n-1, origin,buffer,destination);
        System.out.println("Move disk "+n+" from "+origin+" to "+destination);
        towerOfHanoiRecursion(n-1, buffer,destination,origin);
    }
}
