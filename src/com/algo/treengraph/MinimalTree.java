package com.algo.treengraph;

public class MinimalTree {
    public static void main(String[] args) {
        int [] arr = {1,3,4,5,7,8,10};
            createMinimalBST(arr, 0, arr.length -1);
    }
    public static TreeNode createMinimalBST(int[] arr, int start, int end){
        if(end < start) return null;
        int mid = (start +end) /2;
        TreeNode n = new TreeNode(arr[mid]);
       n.left = createMinimalBST(arr, 0, mid-1);
       n.right = createMinimalBST(arr, mid+1, arr.length-1);

       return n;
    }
}
