package com.company;

import com.sun.source.tree.BinaryTree;

import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {
	// write your code here

        MyBinaryTree theTree = new MyBinaryTree();

        theTree.addNode(50,"root");
        theTree.addNode(25,"Vice Press");
        theTree.addNode(16,"Office Manager");
        theTree.addNode(30,"Secretary");
        theTree.addNode(75,"Sales manager");
        theTree.addNode(85,"Salesman 1");

        theTree.inOrderTraverseTree(theTree.root); //this is were we are going to start at root

        System.out.println("=================================================");

        theTree.preOrderTraverseTree(theTree.root);

        System.out.println("=================================================");

        theTree.postOrderTraversal(theTree.root);

        System.out.println("=================================================");

        System.out.println(theTree.findNode(30));

        System.out.println("=================================================");

        theTree.remove(25);

        theTree.preOrderTraverseTree(theTree.root);
    }
}
