package com.demo.test;

import com.demo.beans.SinglyLinkedList;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList ob=new SinglyLinkedList();
		ob.addAtEnd(11);
		ob.addAtEnd(12);
		ob.addAtEnd(13);
		ob.addAtEnd(14);
		ob.addAtEnd(15);
		
		ob.addBetween(20,3);
		ob.delByPos(3);
		ob.displayData();
	}

}
