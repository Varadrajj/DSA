package com.demo.test;

import java.util.Scanner;

import com.demo.beans.HashingLinkedList;

public class TestHashingLinkedList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashingLinkedList[] HashTab=new HashingLinkedList[5];
		for(int i=0; i<HashTab.length; i++) {
			HashTab[i] =new HashingLinkedList();
		}
		
		int[] arr= {25,45,78,36,27,43,62,28,79,11};
		for(int i=0; i<arr.length; i++) {
			int pos=arr[i]%HashTab.length;
			HashTab[pos].addAtStart(arr[i]);
		}
		
		for(int i=0; i<HashTab.length; i++) {
			HashTab[i].display();
		}
		System.out.println("Enter Value For Searching :");
		int val=sc.nextInt();
		int pos=val%HashTab.length;
		boolean status=HashTab[pos].search(val);
		if(status) {
			System.out.println("Value Found At :"+pos);
		}else {
			System.out.println("Value Does Not Exist");
		}
		
	}

}
