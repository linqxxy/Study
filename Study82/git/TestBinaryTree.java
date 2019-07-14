package com.linqxxy.git;

import java.util.Scanner;

public class TestBinaryTree {
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        BinaryTree.TreeNode root=binaryTree.createBinaryTree(str);
        System.out.println("前序--------------------");
        binaryTree.binaryTreePrevOrder(root);
        System.out.println();
        System.out.println("中序--------------------");
        binaryTree.binaryTreeInOrder(root);
        System.out.println();
        System.out.println("后序--------------------");
        binaryTree.binaryTreePostOrder(root);
        System.out.println();
        System.out.println("节点的个数是"+binaryTree.getSize(root));
        System.out.println("叶子结点个数"+binaryTree.getLeafSize(root));
        System.out.println("第k层的节点个数"+binaryTree.getKLevelSize(root,3));
        if (binaryTree.find(root,'L')==null){
            System.out.println("找到了");
        }else {
            System.out.println("没找到");
        }
        System.out.println(binaryTree.height(root));
        binaryTree.prevBinaryTree(root);
        binaryTree.inBinaryTree(root);
        binaryTree.postBinaryTree(root);
    }
}
