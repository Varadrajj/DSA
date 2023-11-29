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
	
	public DoublyLinkedList(){
		head=null;
	}
	
	public void addAtEnd(int val) {
		Node temp=head;
		Node newNode=new Node(val);
		
		if(head==null) {
			head=newNode;
		}
		else {
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
		newNode.prev=temp;
		}
	}
	
	public void addByPosition(int pos, int val) {
		Node newNode=new Node(val);
		if(pos==1) {
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
		else {
			Node temp=head;
			for(int i=1;temp!=null && i<pos-1;i++) {
				temp=temp.next;
			}
			if(temp!=null) {
			newNode.next=temp.next;
			newNode.prev=temp;
			temp.next=newNode;
			temp.next.prev=newNode;
			}else {
				System.out.println("Wrong Position..!!");
			}
		}
		
		
	}
	
	public int deleteByKey(int val) {
		Node current=head;
		
		while(current.next!=null && current.data!=val) {
			current=current.next;
			
		}
		if(current!=null) {
			if(head==current) {
				head=head.next;
				head.prev=null;
				current.next=null;
				current=null;
			}else {
				Node temp=current.prev;
				temp.next=current.next;
				if(current.next!=null) {
					current.next.prev=temp;
					current.next=null;
				}
				current.prev=null;
				current=null;
			}
		}
		return -1;
		
	}
	
	public void displayAll() {
		Node temp=head;
		Node last=null;
		System.out.println("Print Straight");
		while(temp!=null) {
			System.out.println(temp.data);
			last=temp;
			temp=temp.next;
		}
		System.out.println("Print Reverse");
		while(last!=null) {
			System.out.println(last.data);
			last=last.prev;
		}
		
	}
	

}
