package com.demo.test;

import com.demo.beans.BinaryTree;

public class TestBinaryTree {

	public static void main(String[] args) {
		BinaryTree bst=new BinaryTree();
		bst.insert(60);
		bst.insert(35);
		bst.insert(75);
		bst.insert(40);
		bst.insert(20);
		bst.insert(70);
		bst.insert(85);
		System.out.println("PreOrder Binary Searched Tree= ");
		bst.preOrder();
		System.out.println("\nInOrder Binary Searched Tree= ");
		bst.inOrder();
		System.out.println("\nPostOrder Binary Searched Tree= ");
		bst.postOrder();
	}

}
