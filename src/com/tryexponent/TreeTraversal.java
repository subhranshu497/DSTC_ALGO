package com.tryexponent;

import java.util.Collections;
import java.util.List;

public class TreeTraversal {
    Tree root;
     int maxLevel = 0;
     int rMaxLevel = 0;

    // left-->root-->right
    public void inOrderTraversal(Tree root, List<Integer> inOrderList){
        if(root == null) return;
        inOrderTraversal(root.left, inOrderList);
        inOrderList.add(root.value);
        inOrderTraversal(root.right, inOrderList);
    }
    public void postOrderTraversal(Tree root, List<Integer> postOrderList){
        if(root == null) return;
        postOrderTraversal(root.left, postOrderList);
        postOrderTraversal(root.right, postOrderList);
        postOrderList.add(root.value);
    }
    public void preOrderTraversal(Tree root, List<Integer> preOrderList){
        if(root == null) return;
        preOrderList.add(root.value);
        preOrderTraversal(root.left, preOrderList);
        preOrderTraversal(root.right, preOrderList);
    }
    public void leftViewTraversal(Tree root, List<Integer> leftViewList, int level){
        // base case
        if(root == null) return;
        if(maxLevel < level){
            leftViewList.add(root.value);
            maxLevel = level;
        }
        leftViewTraversal(root.left, leftViewList, level+1);
        leftViewTraversal(root.right, leftViewList, level+1);
    }

    public void rightViewTraversal(Tree root, List<Integer> rightViewList, int level){
        if(root == null) return;
        if(rMaxLevel < level){
            rightViewList.add(root.value);
            rMaxLevel = level;
        }
        rightViewTraversal(root.right, rightViewList, level+1);
        rightViewTraversal(root.left, rightViewList, level+1);
    }

    public void leftViewTraversalModified(Tree root, List<Integer> leftViewList, int level){
        // base case
        if(root == null) return;
        if(maxLevel < level){
            leftViewList.add(root.value);
            maxLevel = level;
        }
        leftViewTraversal(root.left, leftViewList, level+1);
    }
    public void outlineOfBinaryTree(Tree root, List<Integer> list, int level){
        leftViewTraversalModified(root, list, level);
        Collections.reverse(list);
        rightViewTraversal(root.right, list, level);
    }
}
