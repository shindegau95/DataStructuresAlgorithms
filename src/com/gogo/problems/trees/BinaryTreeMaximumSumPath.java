package com.gogo.problems.trees;


//Definition for a binary tree node.

public class BinaryTreeMaximumSumPath {

    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        traverse(root);
        return max;
    }

    public int traverse(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftSum = node.val + traverse(node.left);
        int rightSum = node.val + traverse(node.right);
        int pathSum = leftSum + rightSum - node.val;
        //pathSum
        int localMaxWithoutPath = Math.max(node.val, Math.max(leftSum, rightSum));
        int actualLocalMax = Math.max(localMaxWithoutPath, pathSum);
        max = Math.max(max, Math.max(localMaxWithoutPath, actualLocalMax));
        return localMaxWithoutPath;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
