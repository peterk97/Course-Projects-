package com.company;

public class MyBinaryTree {

    Node root;

    public void addNode(int key, String name) { // this is the structure how we add new nodes to the binary tree
        Node newNode = new Node(key, name);

        if (root == null) { //here checking if the new node is the root or not !
            root = newNode;
        } else {//if not we have to focus on a node

            Node focusNode = root;

            Node parent;

            while (true) {
                parent = focusNode;

                if (key < focusNode.key) {//here we decide if the new node goes to the left or right side

                    focusNode = focusNode.leftChild;

                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {

                    focusNode = focusNode.rightChild;

                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return;

                    }
                }
            }

        }
    }


    //THERE IS 3 KIND OF TRAVERSAL

    //in order traversal
    //this is aim for the smallest value first
    //recursion used to one node and go to it's children node
    public void inOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            inOrderTraverseTree(focusNode.leftChild);

            System.out.println(focusNode);

            inOrderTraverseTree(focusNode.rightChild);
        }
    }

    //Pre-Order traversal
    //root is the first then left side jump all the way down then back to the parent still left side's parents's right child
    // and after back to root then right side the same

    public void preOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {

            System.out.println(focusNode);

            preOrderTraverseTree(focusNode.leftChild);

            preOrderTraverseTree(focusNode.rightChild);
        }
    }


    //Post Order Traversal
    //jump down the left child then jump down to the left child of that parent node then the right child
    //of that parent node
    //than go the the right side of the tree and jump all the way down then back to the root

    public void postOrderTraversal(Node focusNode) {
        if (focusNode != null) {

            postOrderTraversal(focusNode.leftChild);

            postOrderTraversal(focusNode.rightChild);

            System.out.println(focusNode);
        }
    }


    //FIND NODE

    public Node findNode(int key) {

        Node focusNode = root;//start at the top root

        while (focusNode.key != key) {

            if (key < focusNode.key) { //check the left then the right side !!

                focusNode = focusNode.leftChild;

            } else {

                focusNode = focusNode.rightChild;

            }

            if (focusNode == null) { //if it is null we could not find so it is null
                return null;
            }
        }
        return focusNode;//other wise we return the node
    }


    //DELETE NODES

    public boolean remove(int key) {

        Node focusNode = root;
        Node parent = root;

        boolean isItALeftChild = true;

        while (focusNode.key != key) {

            parent = focusNode;

            if (key < focusNode.key) {

                isItALeftChild = true;

                focusNode = focusNode.leftChild;

            } else {

                isItALeftChild = false;

                focusNode = focusNode.rightChild;

            }

            if (focusNode == null) {
                return false;

            }

            if (focusNode.leftChild == null && focusNode.rightChild == null) {

                if (focusNode == root) {

                    root = null;

                } else if (isItALeftChild) {

                    parent.leftChild = null;

                } else {

                    parent.rightChild = null;

                }

            } else if (focusNode.rightChild == null) {

                if (focusNode == root)
                    root = focusNode.leftChild;

                else if (isItALeftChild)
                    parent.leftChild = focusNode.leftChild;

                else parent.rightChild = focusNode.leftChild;

            } else if (focusNode.leftChild == null) {

                if (focusNode == root)
                    root = focusNode.rightChild;

                else if (isItALeftChild)
                    parent.leftChild = focusNode.rightChild;

                else parent.rightChild = focusNode.leftChild;
            } else {

                Node replacement = getReplacementNode(focusNode);

                if (focusNode == root)
                    root = replacement;

                else if (isItALeftChild)
                    parent.leftChild = replacement;

                else parent.rightChild = replacement;

                replacement.leftChild = focusNode.leftChild;

            }

        }
          return true;
    }


    public Node getReplacementNode(Node replacedNode){

        Node replacementParent = replacedNode;
        Node replacement = replacedNode;

        Node focusNode = replacedNode.rightChild;

        while (focusNode != null){

            replacementParent = replacement;

            replacement = focusNode;

            focusNode = focusNode.leftChild;
        }

        if (replacement != replacedNode.rightChild){

             replacementParent.leftChild = replacement.rightChild;

             replacement.rightChild = replacedNode.rightChild;

        }
        return replacement;

    }

}
