package com.tryexponent;

import java.util.List;

public class LeftViewBinaryTree {
    int maxLevel = 0;

    void leftView(Tree root, List<Integer> leftViewList, int level){
        if(root == null) return;
        if(maxLevel < level){
            leftViewList.add(root.value);
            maxLevel = level;
        }
        leftView(root.left, leftViewList, level+1);
        leftView(root.right, leftViewList, level+1);
    }
}
