package com.demo.test;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr= {7,6,3,1,8,9,2,5,15,4};
		System.out.println(Arrays.toString(arr));
		//bubblesort(arr);
		improvedBubblesort(arr);
		System.out.println("Array After Sorted :"+Arrays.toString(arr));
		
	}

	private static void improvedBubblesort(int[] arr) {
		int n=arr.length;
		boolean flag;
		for(int i=0; i<n; i++) {
			flag=false;
			for(int j=0; j<n-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}	
			if(flag==false) {
				break;
			}
			System.out.println(Arrays.toString(arr));
		}
		
		
	}

	private static void bubblesort(int[] arr) {
		int n=arr.length;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		
	}

}
