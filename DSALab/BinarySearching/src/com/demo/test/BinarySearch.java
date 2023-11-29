package com.demo.test;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr= {2,3,4,5,6,7,8,8,9};
		System.out.println("Enter The element you want to search= ");
		Scanner sc=new Scanner(System.in);
		int search= sc.nextInt();
		int pos=search(search,arr);
		if(pos!=-1) {
			System.out.println("Element Found At position= "+pos);
		}
		else {
			System.out.println("Element Not Found!");
		}
		sc.close();

	}

	private static int search(int search, int[] arr) {
		int first=0, last=arr.length-1;
		int cnt=0;
		while(first<=last) {
			int mid=(first+last)/2;
			cnt++;
			if(arr[mid]==search) {
				System.out.println("Compare Count is= "+cnt);
				return mid;
			}
			else if(arr[mid]<search) {
				first=mid+1;
			}
			else {
				last=mid-1;
			}
		}
		System.out.println("Compare Count is= "+cnt);
		return -1;
		
	}
	
	

}
