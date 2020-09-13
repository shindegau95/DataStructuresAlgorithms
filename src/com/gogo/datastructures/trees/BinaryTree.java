package com.gogo.datastructures.trees;

import com.gogo.datastructures.queues.Queue;

public class BinaryTree<T> {
    Node root;
    Queue<Node> queue = new Queue<>();

    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            Node traversalNode = root;
            Node previousNode = traversalNode;
            while (traversalNode != null) {
                previousNode = traversalNode;
                if (data < traversalNode.data) {
                    traversalNode = traversalNode.left;
                } else {
                    traversalNode = traversalNode.right;
                }
            }

            if (data < previousNode.data) {
                previousNode.left = newNode;
            } else {
                previousNode.right = newNode;
            }
        }
    }

    public void remove(int data) {
        if (root == null) {
            throw new RuntimeException("Tree is empty");
        }
        Node current = root;
        Node parent = null;
        while (current != null) {

            if (data < current.data) {
                parent = current;
                current = current.left;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
            }

            if (current.data == data) {
                //there is no right child
                if (current.right == null) {
                    //if the node to be deleted is root
                    if (parent == null) {
                        root = current.left;
                    } else {
                        //to understand if this is a left child or right
                        //check if the parent < current
                        //if so its the right child
                        if (parent.data < current.data) {
                            parent.right = current.left;
                        }
                        //else its the left child
                        else {
                            parent.left = current.left;
                        }
                    }
                }
                //there is no left child
                else if (current.left == null) {
                    //if the node to be deleted is root
                    if (parent == null) {
                        root = current.right;
                    } else {
                        //to understand if this is a left child or right
                        //check if the parent < current
                        //if so its the right child
                        if (parent.data < current.data) {
                            parent.right = current.right;
                        }
                        //else its the left child
                        else {
                            parent.left = current.right;
                        }
                    }
                }
                //it has all children
                else {
                    //find the right child's leftmost child and make it take the place for the current node
                    Node leftmost;
                    if (current.right.left != null) {
                        leftmost = current.right.left;
                        Node leftmostParent = current.right;
                        while (leftmost != null && leftmost.left != null) {
                            leftmostParent = leftmost;
                            leftmost = leftmost.left;
                        }

                        //leftmostParent's left shall now be made leftmost's right subtree
                        leftmostParent.left = leftmost.right;
                        leftmost.right = current.right;
                    } else {
                        leftmost = current.right;
                    }

                    //leftMost is the current node so, to its left is currentNode's left and to its right is currentNode's right
                    leftmost.left = current.left;


                    if (parent == null) {
                        root = leftmost;
                    } else {
                        //current was the left child
                        if (current.data < parent.data) {
                            parent.left = leftmost;
                        } else {
                            parent.right = leftmost;
                        }
                    }
                }
                break;
            }

        }

        if (current == null) {
            throw new RuntimeException("Element not found in the tree");
        }

    }

    public void print() {
        System.out.println("Ascending");
        traverseAcending(root);
        System.out.println("Descending");
        traverseDescending(root);
        System.out.println("BFS");
        traverseBFS();
        System.out.println("DFS");
        traverseDFS();
    }

    public void traverseAcending(Node root) {
        if (root == null) {
            return;
        }
        traverseAcending(root.left);
        System.out.println(root.data);
        traverseAcending(root.right);
    }

    public void traverseDescending(Node root) {
        if (root == null) {
            return;
        }
        traverseDescending(root.right);
        System.out.println(root.data);
        traverseDescending(root.left);
    }

    public void traverseBFS() {
        queue.enqueue(root);
        traverseBFSNode();
    }

    private void traverseBFSNode() {
        while (queue.size() != 0) {
            Node node = queue.dequeue();
            System.out.println(node.data);
            if (node.left != null) {
                queue.enqueue(node.left);
            }
            if (node.right != null) {
                queue.enqueue(node.right);
            }
        }
    }

    public void traverseDFS() {
        traverseDFSNode(root);
    }

    private void traverseDFSNode(Node node) {
        if (node == null) {
            return;
        }
        traverseDFSNode(node.left);
        System.out.println(node.data);
        traverseDFSNode(node.right);
    }
}
