package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveBinarySearching {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		System.out.println(Arrays.toString(arr));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element you want to search= ");
		int search=sc.nextInt();
		int pos=binarySearchRecursive(0,arr.length-1,arr,search);
		if(pos!=-1) {
			System.out.println("Element Found At position= "+pos);
		}else {
			System.out.println("Element Not Found!");
		}
		sc.close();
		

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
				return binarySearchRecursive(mid+1,j,arr,search);
			}else {
				System.out.println(i+","+j+","+mid+","+search);
				return binarySearchRecursive(i,mid-1,arr,search);
			}
		}
		
	}

}
