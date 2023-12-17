package com.leetcode.practice;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        TreeNode2 root = new TreeNode2(1);
        root.right = new TreeNode2(2);
        root.right.left = new TreeNode2(3);
        System.out.println(inOrderTraversal(root));
    }

    private static List<Integer> inOrderTraversal(TreeNode2 root) {
        List<Integer> result = new ArrayList<>();
        inOrderTraversalUtility(root, result);
        return result;
    }

    private static void inOrderTraversalUtility(TreeNode2 root, List<Integer> result) {
        if(root == null) return;
        inOrderTraversalUtility(root.left, result);
        result.add(root.value);
        inOrderTraversalUtility(root.right, result);
    }
}

class TreeNode2{
    int value;
    TreeNode2 left;
    TreeNode2 right;
    public TreeNode2(){}
    public TreeNode2(int value){
        this.value = value;
    }
    public TreeNode2(int value, TreeNode2 left, TreeNode2 right){
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
