package com.datastructure.tree;

public class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode (int data){
        this.data = data;
       // this.left = this.right =null;
    }

    /**
     * to get data from the tree
     */
    public TreeNode getData(int value) {
        if(data == value){
            return this;
        }
        if(value <data){
            if(left !=null){
                return left.getData(value);
            }
            else{
                return right.getData(value);
            }
        }
        return null;
    }

    /**
     * Inorder traversal
     */
    public void traverseInorder() {
        if(left !=null){
            left.traverseInorder();
        }
        System.out.print(data+", ");
        if(right != null){
            right.traverseInorder();
        }
    }
    /**
     * Pre order traversal root -->left --right
     */
    public void traversePreorder() {
        System.out.print(data+", ");
        if(left !=null){
            left.traversePreorder();
        }
        if(right !=null){
            right.traversePreorder();
        }
    }
    /**
     * PostOrder Traversal
     */
    public void traversePostorder(){
        if(left != null){
            left.traversePostorder();
        }
        if(right !=null){
            right.traversePostorder();
        }
        System.out.print(data+", ");
    }

    /**
     * insert value to form BST
     * @return
     */
    public void insert(int value){
        if(value == data) return;
        //for the left sub tree
        if(value < data){
            if(left == null){
                left = new TreeNode(value);
            }
            else{
                left.insert(value);
            }
        }
        if(value > data){
            if(right == null){
                right = new TreeNode(value);
            }
            else{
                right.insert(value);
            }
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
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
