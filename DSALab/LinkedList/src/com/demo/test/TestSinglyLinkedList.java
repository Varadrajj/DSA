package com.demo.test;

import com.demo.beans.SinglyLinkedList;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList ob=new SinglyLinkedList();
		ob.addAtEnd(10);
		
		ob.addAtEnd(20);
		ob.addByPosition(30, 1);
		ob.addByPosition(40, 2);
		ob.addByPosition(80, 1);
		ob.addAtEnd(70);
		ob.displayData();
		//ob.deleteByPosition(5);
		//System.out.println("Deletion=");
		//ob.displayData();
		System.out.println("Delete By Value= ");
		ob.deleteByValue(100);
		ob.displayData();
	}

}
