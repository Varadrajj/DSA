package com.demo.test;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr= {23,56,3,46,88,12,90};
		//int[] arr= {1,2,3,4,5,6,7,8,9};
		System.out.println("Original Array= "+Arrays.toString(arr));
		
		//bubbleSort(arr);
		
		improvedBubbleSort(arr);
//		System.out.println("Sorted Array= ");
//		System.out.println(Arrays.toString(arr));

	}

	private static void improvedBubbleSort(int[] arr) {
		int n=arr.length;
		boolean flag;
		for(int i=0;i<n;i++) {
			flag=false;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}
			System.out.println("Sorted Array= "+Arrays.toString(arr));
			if(!flag) {
				break;
			}
		}
		
	}

	private static void bubbleSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				System.out.println("Sorted Array= "+Arrays.toString(arr));
			}
		}
		
		
	}

}
