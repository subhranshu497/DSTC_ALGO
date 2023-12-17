package com.tryexponent;

import java.util.ArrayList;
import java.util.List;

public class TreeRunner {
    public static void main(String[] args) {
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        root.left.right.left = new Tree(50);
        root.right.left = new Tree(6);
        root.right.right = new Tree(7);
        root.right.right.right = new Tree(8);
        root.right.right.left = new Tree(9);
        System.out.println("=========In Order Traversal==========");
        TreeTraversal inOrder = new TreeTraversal();
        List<Integer> inOrderList = new ArrayList<>();
        inOrder.inOrderTraversal(root, inOrderList);
        System.out.println(inOrderList);
        System.out.println("=========Post Order Traversal==========");
        TreeTraversal postOrder = new TreeTraversal();
        List<Integer> postOrderList = new ArrayList<>();
        postOrder.postOrderTraversal(root, postOrderList);
        System.out.println(postOrderList);
        System.out.println("=========Pre Order Traversal==========");
        TreeTraversal preOrder = new TreeTraversal();
        List<Integer> preOrderList = new ArrayList<>();
        preOrder.preOrderTraversal(root, preOrderList);
        System.out.println(preOrderList);
        System.out.println("=============Left View=================");
        TreeTraversal leftView = new TreeTraversal();
        List<Integer> leftViewList = new ArrayList<>();
        int lLevel = 1;
        leftView.leftViewTraversal(root, leftViewList,lLevel);
        System.out.println(leftViewList);
        System.out.println("=============Right View=================");
        TreeTraversal rightView = new TreeTraversal();
        List<Integer> rightViewList = new ArrayList<>();
        int rLevel = 1;
        rightView.rightViewTraversal(root, rightViewList,rLevel);
        System.out.println(rightViewList);
        System.out.println("=============outline View=================");
        TreeTraversal outlineView = new TreeTraversal();
        List<Integer> list = new ArrayList<>();
        int level = 1;
        outlineView.outlineOfBinaryTree(root, list,level);
        System.out.println(list);
    }
}
