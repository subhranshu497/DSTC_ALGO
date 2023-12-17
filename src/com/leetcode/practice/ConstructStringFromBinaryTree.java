package com.leetcode.practice;

import java.util.ArrayList;
import java.util.List;

public class ConstructStringFromBinaryTree {
    public static void main(String[] args) {
        TreeNode1 root = new TreeNode1(1);
        root.left = new TreeNode1(2);
        root.right = new TreeNode1(3);
        root.left.right = new TreeNode1(4);
        System.out.println(tree2str(root));
    }

    private static String tree2str(TreeNode1 root) {
        //first do the preorder traversal
        StringBuilder treeList = new StringBuilder();
        preOrderTraversalTree1(root,treeList);
        return treeList.toString();
    }

    private static void preOrderTraversalTree1(TreeNode1 root, StringBuilder treeList) {
        if(root == null) return;

        treeList.append(String.valueOf(root.value));
        if(root.left == null & root.right ==null) return;
        treeList.append("(");
        preOrderTraversalTree1(root.left, treeList);
        treeList.append(")");
        if(root.right != null){
            treeList.append("(");
            preOrderTraversalTree1(root.right, treeList);
            treeList.append(")");
        }
    }
}
class TreeNode1{
    int value;
    TreeNode1 left;
    TreeNode1 right;
    TreeNode1(){}
    TreeNode1(int value){
        this.value = value;
    }
    TreeNode1(int value, TreeNode1 left, TreeNode1 right){
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
