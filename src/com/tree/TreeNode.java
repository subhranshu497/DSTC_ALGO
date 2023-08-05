package com.tree;

public class TreeNode {
    private TreeNode leftChild;
    private TreeNode rightChild;
    private int data;

    /**
     * node placement through insertion
     * @param value
     */
    public void insert(int value){
        if(data == value) return;
        if(value < data){
            if(leftChild == null){
                leftChild = new TreeNode(value);
            }
            else{
                leftChild.insert(value);
            }
        }
        else{
            if(rightChild == null){
                rightChild = new TreeNode(value);
            }
            else{
                rightChild.insert(value);
            }
        }
    }
    public void traverseInOrder(){
        if(leftChild != null){
            leftChild.traverseInOrder();
        }
        System.out.println(data+", ");
        if(rightChild !=null){
            rightChild.traverseInOrder();
        }
        System.out.println(data+", ");
    }

    public TreeNode(int value){
        this.data = value;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
