package com.gogo.problems.trees;

import com.gogo.datastructures.trees.Node;

import java.util.HashMap;

public class VerticalSum {
    /*
     * given a tree
     * find the vertical sum of the tree
     * eg.
     *       1
     *   2       3
     * 4     5       6
     *       7
     *
     * vertical sum for line 3 is 1 + 5 +7 = 13
     * */
    HashMap<Integer, Integer> placeSum = new HashMap<>();

    public Integer getVerticalDistance(Node root, int n) {
        //for every right child +1
        //for every left child -1
        placeSum.put(0, root.data);
        populateMap(placeSum, root, 0);
        return placeSum.get(n);
    }

    private void populateMap(HashMap<Integer, Integer> placeSum, Node root, int index) {

        if (root.left != null && root.right != null) {
            //get current height
            placeSum.merge(index - 1, root.left.data, (old, newV) -> old + newV);
            populateMap(placeSum, root.left, index - 1);
            placeSum.merge(index + 1, root.right.data, (old, newV) -> old + newV);
            populateMap(placeSum, root.right, index + 1);
        } else {
            return;
        }
    }
}