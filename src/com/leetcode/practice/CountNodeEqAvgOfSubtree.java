package com.leetcode.practice;

public class CountNodeEqAvgOfSubtree {

    int result;
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(){

        }
        public TreeNode(int val){
            this.val = val;
        }
        public TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return result;
    }

    private int[] dfs(TreeNode node) {
        if(node == null) return new int[]{0, 0};

        int[] left = dfs(node.left);
        int[] right = dfs(node.right);

        int nodeSum = left[0]+right[0]+node.val;
        int nodeCount = left[1]+right[1]+1;

        if(nodeSum/nodeCount == node.val)  result++;

        return new int[]{nodeSum, nodeCount};
    }
}
