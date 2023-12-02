package com.demo.beans;

public class SinglyLinkedList {
	private Node head;
	class Node{
		private int data;
		private Node next;
		public Node(int n){
			data=n;
			next=null;
		}
	}
	
	public SinglyLinkedList() {
		head=null;
	}
	
	public void addAtStart(int n) {
		Node newNode=new Node(n);
		if(head==null) {
			head=newNode;
		}else {
			newNode.next=head;
			head=newNode;
		}
	}
	
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+",");
			temp=temp.next;
		}
		System.out.println();
	}

}
