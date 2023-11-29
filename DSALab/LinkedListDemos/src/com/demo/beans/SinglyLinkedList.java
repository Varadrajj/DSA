package com.demo.beans;

public class SinglyLinkedList {
	private  Node head;
	class Node{
		int n;
		Node next;
		Node(int data) {
			n=data;
			next=null;
		}
	}
	
	public SinglyLinkedList() {
		head=null;
	}
	
	public void addAtEnd(int data) {
		Node newnode=new Node(data);
		if(head==null) {
			head=newnode;
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
		}
	}
	public void addBetween(int data, int position){
		Node newNode = new Node(data);
		if(head == null ) {
			head = newNode;
		}
		if(head.next == null) {
			newNode.next = head;
			head = newNode;
		}
		else {
			Node curr = head;
			for(int i = 1; i < position - 1; i++) {
				curr = curr.next;
			}
			
			newNode.next = curr.next;
			curr.next = newNode;
		}
		
	}
	public void delByPos(int pos) {
		Node temp=null;
		Node trav=head;
		for(int i=1; i<pos;i++) {
			temp=trav;
			trav=trav.next;
		}
		temp.next=trav.next;
	}
	
	
	public void displayData() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.n);
			temp=temp.next;
		}
	}
}
