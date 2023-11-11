package com.leetcode.practice;

import java.util.ArrayList;
import java.util.List;

public class FindModeInBST {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(2);
        findMode(root);
    }

    private static int currentVal;
    private static int currentCount = 0;
    private static int maxCount = 0;
    private static List<Integer> modes = new ArrayList<>();

    public static int[] findMode(TreeNode root) {
        inOrderTraversal(root);
        int[] result = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            result[i] = modes.get(i);
            System.out.println(result[i]);
        }
        return result;
    }

    private static void inOrderTraversal(TreeNode node) {
        if (node == null) return;

        inOrderTraversal(node.left);

        currentCount = (node.val == currentVal) ? currentCount + 1 : 1;
        if (currentCount == maxCount) {
            modes.add(node.val);
        } else if (currentCount > maxCount) {
            maxCount = currentCount;
            modes.clear();
            modes.add(node.val);
        }
        currentVal = node.val;

        inOrderTraversal(node.right);
    }

}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(){}
    public TreeNode(int val){
        this.val = val;
    }
    public TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left =left;
        this.right =right;
    }
}