package com.demo.test;

import java.util.Scanner;

public class SearchData {

	public static void main(String[] args) {
		System.out.println("Enter Array Size: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		acceptdata(arr);
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		System.out.println("Enter Number To Search :");
		int search=sc.nextInt();
		//int pos=linearSearch(arr, search);
		//int pos=binarySearch(arr, search);
		int pos=binarySearchRecursive(0, arr.length-1, search, arr);
		if(pos!=-1) {
			System.out.println("Number Found At :"+pos+" Position");
		}else {
			System.out.println("Number Not Found!!!");
		}
		
	}

	public static int binarySearchRecursive(int first, int last, int search, int[] arr) {
		if(first>last) {
			return -1;
		}else {
			int mid=(first+last)/2;
			if(arr[mid]==search) {
				return mid;
			}else if (arr[mid]<search){
				System.out.println(first+","+last+","+mid+","+search);
				return binarySearchRecursive(mid+1, last, search, arr);
			}else {
				System.out.println(first+","+last+","+mid+","+search);
				return binarySearchRecursive(first, mid-1, search, arr);
			}
		}
	}

	public static int binarySearch(int[] arr, int search) {
		int first=0; int last=arr.length-1;
		int compcnt=0;
		while(first<=last) {
			int mid=(first+last)/2;
			compcnt++;
			if(arr[mid]==search) {
				System.out.println("Compare Count is: "+compcnt);
				return mid;
				//For Ascending Search Sorted Array
			}else if(arr[mid]<search) {
				first=mid+1;
			}else {
				last=mid-1;
			}
		}
		System.out.println("Compare Count Is :"+compcnt);
		return -1;
	}

	private static int linearSearch(int[] arr, int search) {
		for(int j=0; j<arr.length; j++) {
			if(arr[j]==search) {
				return j;
			}
		}
		return -1;
	}

	public static void acceptdata(int[] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter Number :"+i+" Position");
			arr[i]=sc.nextInt();
		}
		
	}

}
