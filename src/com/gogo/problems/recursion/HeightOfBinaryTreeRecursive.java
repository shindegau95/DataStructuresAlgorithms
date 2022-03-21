package com.gogo.problems.recursion;

class Node{
    int n;
    Node left;
    Node right;
}

public class HeightOfBinaryTreeRecursive {
    public int height(Node n){
        if(n.left == null && n.right == null){
            //leaf node
            return 1;
        }else{
            return 1 + Math.max(height(n.left), height(n.right));
        }
    }
}
