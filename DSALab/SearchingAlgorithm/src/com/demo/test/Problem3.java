package com.demo.test;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {5, 7, 8, 10, 12, 13, 15, 17, 18, 20};
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Enter Number To Search :");
		int search=sc.nextInt();
		int pos=binarySearchRecursive(0, arr.length-1, arr, search);
		if(pos!=-1) {
			System.out.println("Element Found At :"+pos);
		}else {
			System.out.println("Element Not Found :");
		}
	}

	private static int binarySearchRecursive(int i, int j, int[] arr, int search) {
		if(i>j) {
			return -1;
		}else {
			int mid=(i+j)/2;
			if(arr[mid]==search) {
				return mid;
			}else if(arr[mid]<search) {
				System.out.println(i+","+j+","+mid+","+search);
				return binarySearchRecursive(mid+1, j, arr, search);
			}else {
				System.out.println(i+","+j+","+mid+","+search);
				return binarySearchRecursive(i, mid-1, arr, search);
			}
		}
	}

}
