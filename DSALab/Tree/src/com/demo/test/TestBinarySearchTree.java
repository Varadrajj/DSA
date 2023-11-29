package com.demo.test;

import com.demo.beans.BinarySearchTree;

public class TestBinarySearchTree {

	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(60);
		bst.insert(35);
		bst.insert(75);
		bst.insert(40);
		bst.insert(20);
		bst.insert(70);
		bst.insert(85);
		bst.preOrder();
		System.out.println();
		bst.inOrder();
		System.out.println();
		bst.postOrder();
		
}
}
		