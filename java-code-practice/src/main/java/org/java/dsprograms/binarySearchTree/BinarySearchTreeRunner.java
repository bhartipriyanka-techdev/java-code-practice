package org.java.dsprograms.binarySearchTree;

public class BinarySearchTreeRunner {
    public static void main(String[] args) {
        BinaryNode root = new BinaryNode(20);
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter Enter node :");
        BinarySearchTreeImpl binarySearchTree = new BinarySearchTreeImpl();
        binarySearchTree.insertNod(root , 20);
        binarySearchTree.insertNod(root , 10);
        binarySearchTree.insertNod(root , 30);
        binarySearchTree.insertNod(root , 5);
        binarySearchTree.insertNod(root , 15);
        binarySearchTree.insertNod(root , 25);
        binarySearchTree.insertNod(root , 35);
        binarySearchTree.insertNod(root , 3);
        binarySearchTree.insertNod(root , 45);
        System.out.println("---------------Pre Order Traversing-------------------");
        binarySearchTree.preOrderTraversing(root);
        System.out.println("\n---------------In Order Traversing---------------------");
        binarySearchTree.inOrderTraversing(root);
        System.out.println("\n---------------Post Order Traversing---------------------");
        binarySearchTree . postOrderTraversing(root);



    }

}
