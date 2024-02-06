package org.java.dsprograms.binarySearchTree;

public class BinarySearchTreeImpl {
    void insertNod(BinaryNode root, int value){
        if(root.data > value){
            if(root.left == null) {
                System.out.println(value + " had be inserted towards left  of " + root.data);
                root.left = new BinaryNode(value);
            }
                else{
                    insertNod(root.left ,value);
                }
        }
        else{
            if(root.right == null) {
                System.out.println(value + " had be inserted towards Right  of " + root.data);
                root.right = new BinaryNode(value);
            }
            else {
                insertNod(root.right, value);
            }
        }
    }
    void preOrderTraversing(BinaryNode root){
        if(root != null){
            System.out.print(root.data + " ");
            preOrderTraversing(root.left);
            preOrderTraversing(root.right);
        }

    }
    void inOrderTraversing(BinaryNode root){
        if(root != null){
            inOrderTraversing(root.left);
            System.out.print(root.data+" ");
            inOrderTraversing(root.right);
        }
    }
    void postOrderTraversing(BinaryNode root){
        if(root != null){
            postOrderTraversing(root.left);
            postOrderTraversing(root.right);
            System.out.print(root.data+" ");

        }
    }
}
