package com.demo.test;

import com.demo.beans.DoublyLinkedList;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList db= new DoublyLinkedList();
		
		db.addAtEnd(10);
		db.addAtEnd(20);
		db.addAtEnd(30);
		db.addAtEnd(40);
		db.addAtEnd(50);
		db.displayAll();
//		System.out.println("...");
//		db.addByPosition(1, 30);
//		db.addByPosition(3, 40);
//		db.displayAll();
		System.out.println("---");
		db.deleteByKey(50);
		db.displayAll();
		

	}

}
