package com.demo.beans;

public class HashingLinkedList {
	private Node head;
	class Node{
		private int data;
		private Node next;
		public Node(int n) {
			data=n;
			next=null;
		}
	}
	public HashingLinkedList() {
		head=null;
	}
	public void addAtStart(int value) {
		Node newnode=new Node(value);
		if(head==null) {
			head=newnode;
		}else {
			newnode.next=head;
			head=newnode;
		}
	}
	public boolean search(int value) {
		Node temp=head;
		while(temp!=null) {
			if(temp.data==value) {
				return true;
			}
			temp=temp.next;
		}		 
			   return false;
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
