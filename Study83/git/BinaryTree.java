package com.linqxxy.git;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    class TreeNode {
        char val;
        TreeNode left;
        TreeNode right;

        public TreeNode(char val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    void binaryTreePrevOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        binaryTreePrevOrder(root.left);
        binaryTreePrevOrder(root.right);
    }

    void binaryTreeInOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        binaryTreeInOrder(root.left);
        System.out.print(root.val + " ");
        binaryTreeInOrder(root.right);
    }

    void binaryTreePostOrder(TreeNode root) {
        if (root == null) {

            return;
        }
        binaryTreePostOrder(root.left);
        binaryTreePostOrder(root.right);
        System.out.print(root.val + " ");
    }

    //根据字符串创建二叉树，递归，先序遍历。
    private int i = 0;

    TreeNode createBinaryTree(String s) {
        TreeNode root = null;
        /**
         * 1.如果对应字符不是#,那么创建一个节点。
         * 2.如果是#，那么下标++；
         */
        if (s.charAt(i) != '#') {
            root = new TreeNode(s.charAt(i));
            i++;
            root.left = createBinaryTree(s);
            root.right = createBinaryTree(s);
        } else {
            i++;
        }
        return root;
    }

    int getSize(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return getSize(root.left) + getSize(root.right) + 1;
        }
    }

    int getLeafSize(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return getLeafSize(root.right) + getLeafSize(root.left);
    }

    int getKLevelSize(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }
        return getKLevelSize(root.left, k - 1) + getKLevelSize(root.right, k - 1);
    }

    TreeNode find(TreeNode root, int value) {
        if (root == null) {
            return null;
        }
        if (root.val == value) {
            return root;
        } else if (find(root.left, value) == null) {
            return find(root.right, value);
        } else {
            return find(root.left, value);
        }
    }

    int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;
    }

    void prevBinaryTree(TreeNode root) {
        TreeNode cur = root;
        TreeNode top = null;
        Stack<TreeNode> stack = new Stack<>();
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                System.out.print(cur.val + " ");
                stack.push(cur);
                cur = cur.left;
            }
            top = stack.pop();
            cur = top.right;
        }
        System.out.println();
    }

    void inBinaryTree(TreeNode root) {
        TreeNode cur = root;
        TreeNode top = null;
        Stack<TreeNode> stack = new Stack<>();
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            top = stack.pop();
            System.out.print(top.val + " ");
            cur = top.right;
        }
        System.out.println();
    }

    void postBinaryTree(TreeNode root) {
        TreeNode cur = root;
        TreeNode pre = null;
        Stack<TreeNode> stack = new Stack<>();
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.peek();
            if (cur.right == null || cur.right == pre) {
                System.out.print(cur.val + " ");
                stack.pop();
                pre = cur;//代表cur已经打印。
                cur = null;
            } else {
                cur = cur.right;
            }
        }
        System.out.println();
    }

    void binaryTreeLevel(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode cur = null;
        if (root != null) {
            queue.offer(root);
            while (!queue.isEmpty()) {
                cur = queue.peek();
                System.out.print(cur.val + " ");
                queue.poll();
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }
        } else {
            return;
        }
        System.out.println();
    }

    int binaryTreeComplite(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.offer(root);
        }else {
            return -1;
        }
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (cur != null) {
                queue.offer(cur.left);
                queue.offer(cur.right);
            } else {
                break;
            }
        }
        while (!queue.isEmpty()){
            TreeNode n=queue.poll();
            if (n!=null){
                return -1;
            }
        }
        return 0;
    }
}
