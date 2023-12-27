package com.leetcode.practice;

import com.tryexponent.Tree;

class TreeNode3{
    TreeNode3 left;
    TreeNode3 right;
    int value;
    public TreeNode3(){
    }
    public TreeNode3(int value){
        this.value = value;
    }
    public TreeNode3(int value, TreeNode3 left, TreeNode3 right){
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

public class MaximumAverageOfSubtree {
    public static void main(String[] args) {
        TreeNode3 root = new TreeNode3(5);
        root.left = new TreeNode3(6);
        root.right = new TreeNode3(1);
        //System.out.println(maxAvgSubTree(root));
    }

    class State {
        int nodeCount;
        int valueSum;
        double maxAvg;

        public State(int nodeCount, int valueSum, double maxAvg) {
            this.nodeCount = nodeCount;
            this.valueSum = valueSum;
            this.maxAvg = maxAvg;
        }
    }
        private double maxAvgSubTree(TreeNode3 root) {
            return maxAvg(root).maxAvg;
        }
        State maxAvg(TreeNode3 root){
            if(root == null) return new State(0,0,0);
            State left = maxAvg(root.left);
            State right = maxAvg(root.right);
            int nodeCount = left.nodeCount + right.nodeCount +1;
            int sum = left.valueSum + right.valueSum + root.value;

            double maxAvg = Math.max(sum /nodeCount, Math.max(right.maxAvg, left.maxAvg));

            return new State(nodeCount, sum, maxAvg);
        }
}

