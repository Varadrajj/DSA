package com.demo.beans;

public class DoublyLinkedList {
	private Node head;
	class Node{
		private int data;
		private Node prev;
		private Node next;
		public Node(int d) {
			data=d;
			prev=null;
			next=null;
		}
	}
	public DoublyLinkedList() {
		head=null;
	}
	public void addAtEnd(int data) {
		Node newnode=new Node(data);

			Node temp=head;
			while(temp.next!=null) {
				temp.next.prev=newnode;
				temp.next=newnode;
				newnode.prev=temp;
				temp=newnode;
				temp=temp.next;
				
			
			
		}
		
	}
	public void displayAll() {
		Node temp=head;
		if(temp!=null) {
			System.out.println(temp.data);
		}
	}
}
