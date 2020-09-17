package com.gogo.problems.trees;

import com.gogo.datastructures.trees.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VerticalSumTest {

    VerticalSum verticalSum;
    Node node1 = new Node(1);


    @BeforeEach
    void setUp() {
        verticalSum = new VerticalSum();


        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        node3.left = node7;
        node3.right = node6;
    }

    @Test
    void getVerticalDistance() {
        assertEquals(13, verticalSum.getVerticalDistance(node1, 0));
    }
}