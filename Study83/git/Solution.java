package com.linqxxy.git;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

class Solution {
    List<Integer> list =new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null){
            return list;
        }
        list.add(1);
        while (!list.isEmpty()){

        }
        return list;
    }
}