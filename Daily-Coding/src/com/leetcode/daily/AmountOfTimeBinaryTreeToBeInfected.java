package com.leetcode.daily;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AmountOfTimeBinaryTreeToBeInfected {
    private static int maxDist;
    public static void main(String[] args) {
        TreeNode1 root = new TreeNode1(1);
        root.left = new TreeNode1(5);
        root.right = new TreeNode1(3);
        root.right.left = new TreeNode1(10);
        root.right.right = new TreeNode1(6);
        root.left.right = new TreeNode1(4);
        root.left.right.left = new TreeNode1(9);
        root.left.right.right = new TreeNode1(2);
        int start =3;
       System.out.println(amountOfTime(root, start));
    }
    //convert a tree to undirected graph -- BFS
    // i will implement it later
    private void convertToGraph(TreeNode1 root){
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        if(root == null) return;
        if(!graph.containsKey(root.val)){
            graph.put(root.val, new HashSet<>());
            Set<Integer> values = new HashSet<>();
            if(root.left != null) values.add(root.left.val);
            if(root.right != null) values.add(root.right.val);

        }
    }

    private static int amountOfTime(TreeNode1 root, int start) {
        //Traverse till infected node origin
        dfsSolution(root, start);
        return maxDist;
    }

    private static int dfsSolution(TreeNode1 root, int start) {
        int depth =0;
        if(root == null)return depth;
        int leftDepth = dfsSolution(root.left, start);
        int rightDepth = dfsSolution(root.right, start);

        if(root.val == start){
            maxDist = Math.max(leftDepth, rightDepth);
            depth = -1;
        }
        else if(leftDepth>=0 && rightDepth >=0){
            depth = Math.max(leftDepth, rightDepth)+1;
        }
        else{
            int dist = Math.abs(leftDepth)+Math.abs(rightDepth);
            maxDist = Math.max(maxDist, dist);
            depth = Math.min(leftDepth, rightDepth)-1;
        }
        return depth;
    }
}
class TreeNode1{
    int val;
    TreeNode1 left;
    TreeNode1 right;
    public TreeNode1(){}
    public TreeNode1(int val){
        this.val=val;
    }
    public TreeNode1(int val, TreeNode1 left, TreeNode1 right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}
