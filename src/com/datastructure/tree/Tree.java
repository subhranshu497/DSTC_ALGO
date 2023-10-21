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
    // get a data from the tree
    public TreeNode getData(int value){
        if(root !=null){
            return root.getData(value);
        }
        return null;
    }
    //inorder traversal
    public void traverseInorder(){
        if(root !=null){
            root.traverseInorder();
        }
    }
    //Traverse preorder - root -->left -->right
    public void traversePreorder(){
        if(root !=null){
            root.traversePreorder();
        }
    }
    //Traverse postorder - left -->right -->root
    public void traversePostorder(){
        if(root !=null){
            root.traversePostorder();
        }
    }
}
