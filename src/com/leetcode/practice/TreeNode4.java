package com.leetcode.practice;

import java.net.HttpRetryException;
import java.util.Stack;

public class TreeNode4 {
    int val;
    TreeNode4 left;
    TreeNode4 right;
    public TreeNode4(){}
    public TreeNode4(int val){
        this.val = val;
    }
    public TreeNode4(int val, TreeNode4 left, TreeNode4 right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution2 {
    static int sum;
    public static void main(String[] args) {
        int low = 7;
        int high = 15;
        TreeNode4 root = new TreeNode4(10);
        root.left = new TreeNode4(5);
        root.right = new TreeNode4(15);
        root.left.left = new TreeNode4(3);
        root.left.right = new TreeNode4(7);
        root.right.right = new TreeNode4(18);
        System.out.println(rangeIter(root, low, high));
    }
    public static int rangeSumBST(TreeNode4 root, int low, int high) {
        traverse(root,low,high);
        return sum;
    }

    public static void traverse(TreeNode4 root, int low, int high){

        if(root != null){
            if(low < root.val) rangeSumBST(root.left, low, high);
            if(low<= root.val && high >= root.val){
                sum += root.val;
            }

            if(high > root.val) rangeSumBST(root.right, low, high);
        }
    }
    public static int rangeIter(TreeNode4 root, int low, int high){
        int result = 0;
        Stack<TreeNode4> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode4 node = stack.pop();
            if(node !=null) {
                if (low <= node.val && high >= node.val) {
                    result += node.val;
                }
                if (low < node.val) stack.push(node.left);
                if (high > node.val) stack.push(node.right);
            }
        }
        return result;
    }
}
