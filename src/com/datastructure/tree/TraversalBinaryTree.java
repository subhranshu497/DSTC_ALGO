package com.datastructure.tree;

public class TraversalBinaryTree {
    public static void main(String[] args) {
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);

        intTree.traverseInorder();
        System.out.println();
        intTree.traversePreorder();
        System.out.println();
        intTree.traversePostorder();
    }

}
