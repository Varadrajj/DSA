package com.demo.test;

import com.demo.beans.DoublyLinkedList;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList ob=new DoublyLinkedList();
		ob.addAtEnd(10);
		ob.addAtEnd(20);
		ob.addAtEnd(30);
		ob.addAtEnd(40);
		ob.displayAll();

	}

}
