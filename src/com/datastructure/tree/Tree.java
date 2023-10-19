package com.datastructure.tree;

public class Tree {
    private TreeNode root;

    public void insert(int value){
        if(root == null){
            root = new TreeNode(value);
        }
        else{
            root.insert(value);
        }
    }
    //inorder traversal
    public void traverseInorder(){
        if(root !=null){
            root.traverseInorder();
        }
    }
}
