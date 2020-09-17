package com.gogo.problems.trees;

import com.gogo.datastructures.trees.Node;

public class MaxDepth {
    //given a tree find the maximum depth of the tree

    int maxDepth(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftDepth = maxDepth(node.left);
            int rightDepth = maxDepth(node.right);
            return Math.max(leftDepth + 1, rightDepth + 1);
        }
    }
}
