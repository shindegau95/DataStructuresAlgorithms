package com.gogo.datastructures.trees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeTest {

    BinaryTree binaryTree;

    @BeforeEach
    void setUp() {
        binaryTree = new BinaryTree();
    }

    @Test
    void insert() {
        binaryTree.insert(2);
        binaryTree.insert(1);
        binaryTree.insert(5);
        binaryTree.insert(3);
        binaryTree.insert(4);
        binaryTree.print();
    }

    @Test
    void remove_root_noChild() {
        binaryTree.insert(4);
        binaryTree.remove(4);
        binaryTree.print();
        assertEquals(null, binaryTree.root);
    }

    @Test
    void remove_root_leftChild() {
        binaryTree.insert(4);
        binaryTree.insert(3);
        binaryTree.remove(4);
        binaryTree.print();
        assertEquals(3, binaryTree.root.data);
    }

    @Test
    void remove_root_rightChild() {
        binaryTree.insert(4);
        binaryTree.insert(5);
        binaryTree.remove(4);
        binaryTree.print();
        assertEquals(5, binaryTree.root.data);
    }

    @Test
    void remove_leaf_leftchild() {
        binaryTree.insert(4);
        binaryTree.insert(3);
        binaryTree.insert(2);
        binaryTree.insert(1);
        binaryTree.remove(1);
        binaryTree.print();
    }

    @Test
    void remove_leaf_rightchild() {
        binaryTree.insert(4);
        binaryTree.insert(5);
        binaryTree.insert(6);
        binaryTree.insert(7);
        binaryTree.remove(7);
        binaryTree.print();
    }

    @Test
    void remove_nonleaf() {
        binaryTree.insert(8);
        binaryTree.insert(4);
        binaryTree.insert(3);
        binaryTree.insert(5);
        binaryTree.insert(7);
        binaryTree.insert(6);
        binaryTree.remove(4);
        binaryTree.print();
    }
}