package com.algo.treengraph;

import java.util.Stack;

public class BinarySearchTree {
    public static Integer lastPrinted = null;
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(20);
        TreeNode node2 = new TreeNode(20);

        node1.left = node2;
//        TreeNode node1 = new TreeNode(8);
//        TreeNode node2 = new TreeNode(3);
//        TreeNode node3 = new TreeNode(10);
//        TreeNode node4 = new TreeNode(1);
//        TreeNode node5 = new TreeNode(6);
//        TreeNode node6 = new TreeNode(4);
//        TreeNode node7 = new TreeNode(7);
//        TreeNode node8 = new TreeNode(14);
//        TreeNode node9 = new TreeNode(13);
//
//        node1.left=node2;
//        node1.right=node3;
//        node2.left=node4;
//        node2.right=node5;
//        node5.left=node6;
//        node5.right=node7;
//        node3.right=node8;
//        node8.left=node9;
        boolean b = checkBST(node1);
        if(b)
            System.out.println("Its a binary search tree");
        else
            System.out.println("IT is not a binary search tree");

    }
    public static boolean checkBST(TreeNode root){
        Integer left_node_val = - Integer.MAX_VALUE;
        Stack<TreeNode> stack = new Stack<>();
        while(!stack.isEmpty() || root != null){
            while (root !=null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if(root.data <= left_node_val) return false;
            left_node_val = root.data;
            root = root.right;
        }
        return true;
    }
}
