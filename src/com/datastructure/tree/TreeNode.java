package com.datastructure.tree;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode (int val){
        this.val = val;
       // this.left = this.right =null;
    }
    /**
     * Inorder traversal
     */
    public void traverseInorder() {
        if(left !=null){
            left.traverseInorder();
        }
        System.out.print(val+", ");
        if(right != null){
            right.traverseInorder();
        }
    }

    /**
     * insert value to form BST
     * @return
     */
    public void insert(int value){
        if(value == val) return;
        //for the left sub tree
        if(value < val){
            if(left == null){
                left = new TreeNode(value);
            }
            else{
                left.insert(value);
            }
            if(value > val){
                if(right == null){
                    right = new TreeNode(value);
                }
                else{
                    right.insert(value);
                }
            }
        }
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
