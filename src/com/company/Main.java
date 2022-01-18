package com.company;

public class Main {

    public static void main(String[] args) {
	    BinarySearchTree leftRotation = new BinarySearchTree();
        leftRotation.insert(50);
        leftRotation.insert(25);
        leftRotation.insert(10);

        BinarySearchTree rightRotation = new BinarySearchTree();
        leftRotation.insert(50);
        leftRotation.insert(75);
        leftRotation.insert(100);

        BinarySearchTree leftRight = new BinarySearchTree(); //also called double left
        leftRotation.insert(50);
        leftRotation.insert(75);
        leftRotation.insert(60);

        BinarySearchTree rightLeft = new BinarySearchTree(); //also called double right
        leftRotation.insert(50);
        leftRotation.insert(25);
        leftRotation.insert(40);
    }
}
