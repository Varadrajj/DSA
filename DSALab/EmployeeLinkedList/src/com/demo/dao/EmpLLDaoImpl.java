package com.demo.dao;

import com.demo.beans.Employee;

public class EmpLLDaoImpl implements EmpLLDao{
	private Node head;
	class Node {
		private Employee emp;
		private Node next;
		public Node(Employee e) {
			emp=e;
			next=null;
		}
	}
	public EmpLLDaoImpl() {
		head=null;
	}
	@Override
	public void save(Employee e) {
		Node newnode=new Node(e);
		if(head==null) {
			head=newnode;
			System.out.println("Employee Added Successfully");
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
			System.out.println("Employee Added Successfully");
		}
		
	}
	@Override
	public void getAll() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.emp);
			temp=temp.next;
		}
		
	}
	@Override
	public Employee deleteId(int id) {
		Employee e;
		if(head.emp.getId()==id) {
			e=head.emp;
			Node temp=head;
			head=head.next;
			temp.next=null;
			return e;
		}
		
		Node prev=head;
		Node curr=head.next;
		while(curr!=null && curr.emp.getId()!=id) {
			curr=curr.next;
			prev=prev.next;
		}
		if(curr!=null) {
			e=curr.emp;
			prev.next=curr.next;
			curr.next=null;
			curr=null;
			return e;
			
		}else {
			return null;
		}
	}
	@Override
	public Employee searchId(int id) {
		    Employee e;
			Node temp=head;
			while(temp!=null && temp.emp.getId()!=id) {
				temp=temp.next;
			}
			if(temp!=null) {
				return temp.emp;
			}else {
				return null;
			}
		}
	

}
