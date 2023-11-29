package com.demo.beans;

public class BinaryTree {
	private Node root;
	class Node{
		private int data;
		private Node left;
		private Node right;
		
		public Node(int n) {
			data=n;
			left=null;
			right=null;
		}
	}
	
	public BinaryTree() {
		root=null;
	}
	
	public void insert(int key) {
		root=insertRec(root,key);
	}

	private Node insertRec(Node root, int key) {
		if(root==null) {
			root=new Node(key);
			return root;
		}
		
		if(key<root.data) {
			root.left=insertRec(root.left,key);	
		}else {
			root.right=insertRec(root.right,key);
		}
		return root;
	}
	
	public void preOrder() {
		preOrderTraversal(root);
	}

	private void preOrderTraversal(Node root) {
		if(root!=null) {
		System.out.print(root.data+",");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
		}
		
	}
	
	public void inOrder() {
		inOrderTraversal(root);
	}

	private void inOrderTraversal(Node root) {
		if(root!=null) {
		inOrderTraversal(root.left);
		System.out.print(root.data+",");
		inOrderTraversal(root.right);
		}
	}
	
	public void postOrder() {
		postOrderTraversal(root);
	}

	private void postOrderTraversal(Node root) {
		if(root!=null) {
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(root.data+",");
		}
	}

}
