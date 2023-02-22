package com.algo.treengraph;

public class CheckBalanced {
    public static void main(String[] args) {

    }
    public static int getHeight(TreeNode root){
        if(root == null) return -1;
        return Math.max(getHeight(root.left), getHeight(root.right))+1;
    }

    public static boolean isBalanced(TreeNode root){
        if(root == null) return true;
        int bf = Math.abs(getHeight(root.left) - getHeight(root.right));
        if(bf >1) return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }
    //another approach to check balanced

    public static int checkHeight(TreeNode root){
        if(root == null) return -1;
        int leftHeight = checkHeight(root.left);
        int rightHeight = checkHeight(root.right);

        int diff = Math.abs(leftHeight - rightHeight);

        if(diff >1) return Integer.MIN_VALUE;

        return Math.max(leftHeight , rightHeight) +1;
    }
    public static boolean isBalanced1(TreeNode root){
        return  checkHeight(root) != Integer.MIN_VALUE;
    }

}
