package com.leetcode.daily;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(5);
        root2.right = new TreeNode(1);
        System.out.println(leafSimilar(root1, root2));
    }
    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        inOrderTraversal(root1, list1);
        inOrderTraversal(root2, list2);
        if(list1.size() != list2.size())return false;
        for(int i =0;i<list1.size();i++){
            if(list1.get(i) != list2.get(i)) return false;
        }
        return true;
    }

    public static void inOrderTraversal(TreeNode root, List<Integer> leafNodeList){
        if(root !=null){
            if(root.left == null && root.right == null) leafNodeList.add(root.val);
            inOrderTraversal(root.left,leafNodeList);
            inOrderTraversal(root.right,leafNodeList);
        }
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(){}
    public TreeNode(int val){
        this.val = val;
    }
    public TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
