/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Raghunandan
 */
public class NewClass {

    private Node rootNode;
    private int height;

    public NewClass() {
        Node n1 = new Node();
        addNode(n1, 5);
        Node n2 = new Node();
        addNode(n2, 1);
        Node n3 = new Node();
        addNode(n3, 8);
        Node n4 = new Node();
        addNode(n4, 6);
        Node n5 = new Node();
        addNode(n5, 3);
        Node n6 = new Node();
        addNode(n6, 9);
        //System.out.println("In Order");
        //printInOrder(rootNode);
        //System.out.println("Pre Order");
        //printPreOrder(rootNode);
        //System.out.println("Post Order");
        //printPostOrder(rootNode);
        height = heightOfBinaryTree(rootNode);

        System.out.println("Print data at each level");
        //printDataAtLevel(rootNode);
        printDataAtLevelReverse(rootNode);
        // System.out.println("Depth First");
       // reverseLevelOrder();

    }

    public static void main(String[] args) {
        new NewClass();
    }

    public void addNode(Node n, int value) {
        if (rootNode == null) {
            Node temp = new Node();
            temp.setData(value);
            rootNode = temp;
        } else {
            addToPosition(rootNode, value);
        }

    }

    public void addToPosition(Node n, int value) {
        if (value <= n.getData()) {
            if (n.getLeftNode() != null) {
                addToPosition(n.getLeftNode(), value);
            } else {
                Node temp = new Node();
                temp.setData(value);
                n.setLeftNode(temp);
            }
        } else if (value >= n.getData()) {
            if (n.getRightNode() != null) {
                addToPosition(n.getRightNode(), value);
            } else {
                Node temp = new Node();
                temp.setData(value);
                n.setRightNode(temp);
            }
        }
    }

    public void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.getLeftNode());
            System.out.println(node.getData());
            printInOrder(node.getRightNode());
        }
    }

    public void printPreOrder(Node node) {
        if (node != null) {
            System.out.println(node.getData());
            printPreOrder(node.getLeftNode());
            printPreOrder(node.getRightNode());
        }
    }

    public void printPostOrder(Node node) {
        if (node != null) {
            printPostOrder(node.getLeftNode());
            printPostOrder(node.getRightNode());
            System.out.println(node.getData());
        }
    }

    public int heightOfBinaryTree(Node node) {
        if (node == null) {
            return 0;
        } else {
            return 1
                    + Math.max(heightOfBinaryTree(node.getLeftNode()),
                            heightOfBinaryTree(node.getRightNode()));
        }
    }

    private void printDataAtLevelBFS(Node rootNode) {

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(rootNode);
        int currentLevelCount = 1;
        int nextLevelCount = 0;

        while (!queue.isEmpty()) {
            Node n = queue.remove();
            System.out.print(n.getData() + " ");
            if (n.getLeftNode() != null) {
                //System.out.print(n.getData() + " ");

                queue.add(n.getLeftNode());
                nextLevelCount++;
                System.out.println("left node data " + n.getLeftNode().getData() + " " + nextLevelCount);
            }
            if (n.getRightNode() != null) {
                //System.out.print(n.getData() + " ");

                queue.add(n.getRightNode());
                nextLevelCount++;
                System.out.println("right node data " + n.getRightNode().getData() + " " + nextLevelCount);
            }
            currentLevelCount--;
            if (currentLevelCount == 0) {
                System.out.println("");
                currentLevelCount = nextLevelCount;
                nextLevelCount = 0;
            }
        }
    }

    private void printDataAtLevel(Node rootNode) {

        Queue<Node> queue = new LinkedList<Node>();

        queue.add(rootNode);
        while (!queue.isEmpty()) {
            int levelNodes = queue.size();
            //System.out.print("Queue Size " + levelNodes);
            while (levelNodes > 0) {
                
                Node n = (Node) queue.remove();
                
                System.out.print(" " + n.getData());
                if (n.getLeftNode() != null) {
                    queue.add(n.getLeftNode());
                }
                if (n.getRightNode() != null) {
                    queue.add(n.getRightNode());
                }

                levelNodes--;
            }
            System.out.println("");
        }
        //System.out.println("Reversed");
 

    }
    
        private void printDataAtLevelReverse(Node rootNode) {

        Stack<Node> stack = new Stack<Node>();

        stack.push(rootNode);
        while (!stack.isEmpty()) {
            int levelNodes = stack.size();
    
            while (levelNodes > 0) {
                Node n = rootNode;
             
                if (n.getLeftNode() != null) {
                   stack.add(n.getLeftNode());
                }
                if (n.getRightNode() != null) {
                    stack.add(n.getRightNode());
                }
                
            }
            levelNodes--;
                System.out.println(""+stack.pop().getData());
        }
            System.out.println("");
        }
       
 

    }
    
    
     


