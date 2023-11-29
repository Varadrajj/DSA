package com.demo.beans;

import com.demo.beans.SinglyLinkedList;

public class SinglyLinkedList {
	private Node head;
	class Node{
		private int data;
		private Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	public SinglyLinkedList() {
		head=null;
	}
	
	public void displayData() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public void addAtEnd(int data) {
		Node newNode=new Node(data);
		Node temp=head;
		if(head==null) {
			head=newNode;
		}
		else {
		while(temp.next!=null) {
			temp=temp.next;		
		}
		temp.next=newNode;
		}
	}
	
	public void addByPosition(int data,int pos) {
		Node newNode=new Node(data);
		Node temp=head;
		if(head==null && pos!=1) {
			System.out.println("List is Empty..!!");
		}
		if(pos==1) {
			if(head==null) {
				head=newNode;
			}
			else {
				newNode.next=head;
				head=newNode;
			}
		}
		else {
			for(int i=1;i<pos-1;i++) {
				temp=temp.next;
			}
			newNode.next=temp.next;
			temp.next=newNode;
		}
		
	}
	
	public void deleteByPosition(int pos) {
		Node temp=head;
		Node current=temp.next;
		if(pos==1) {
			head=temp.next;
			temp.next=null;
		}else{
		for(int i=1;i<pos-1;i++) {
			temp=temp.next;
			
		}
		if(temp.next==null) {
			System.out.println("Position is Wrong..!!");
		}else {
		current=temp.next;
		temp.next=current.next;
		current.next=null;
		current=null;
		
		}
	    }
		
	
	}
	
	public void deleteByValue(int d) {
		Node temp=head;
		Node current= temp.next;
		
		if(head==null) {
			System.out.println("List is empty..!!");
		}
		
		if(head.data==d) {
			head=head.next;
			temp.next=null;	
		}else {
			while(current!=null && current.data!=d) {
				current=current.next;
				temp=temp.next;
				
			}
			if(current==null) {
				System.out.println("Value is not Found!!");
			}else {
			temp.next=current.next;
			current.next=null;
			current=null;
			}
		}
	}
}
