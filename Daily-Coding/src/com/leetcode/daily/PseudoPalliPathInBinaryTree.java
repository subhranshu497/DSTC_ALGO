package com.leetcode.daily;

public class PseudoPalliPathInBinaryTree {
    static int count;
    static int[] digits;
    public static void main(String[] args) {
        TreeNode2 root = new TreeNode2(2);
        root.left = new TreeNode2(3);
        root.right = new TreeNode2(1);
        root.left.left = new TreeNode2(3);
        root.left.right = new TreeNode2(1);
        root.right.right = new TreeNode2(1);
        System.out.println(pseudoPalindromicPaths(root));
    }

    private static int pseudoPalindromicPaths(TreeNode2 root) {
        count =0;
        digits = new int[10];
        binaryTreedfs(root);
        return count;
    }

    private static void binaryTreedfs(TreeNode2 root) {
        if(root == null) return;
        digits[root.val]++;
        if(root.left == null && root.right == null){
            if(isPallindrome()){
                count++;
            }
        }
        else{
            binaryTreedfs(root.left);
            binaryTreedfs(root.right);
        }
        digits[root.val]--;
    }

    private static boolean isPallindrome() {
        int odd =0;
        for(int i=1;i<=9;i++){
            if(digits[i]%2 !=0) odd++;
        }
        if(odd>1) return false;
        return true;
    }
}
class TreeNode2{
    int val;
    TreeNode2 left;
    TreeNode2 right;
    public TreeNode2(){}
    public TreeNode2(int val){
        this.val = val;
    }
    public TreeNode2(int val, TreeNode2 left, TreeNode2 right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
