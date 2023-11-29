package com.demo.test;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr= {4,3,8,5,9,1,7,2};
		System.out.println("Original Array= "+Arrays.toString(arr));
		
		insertionSort(arr);
		System.out.println("Sorted Array= "+Arrays.toString(arr));
	}

	private static void insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			for(;j>=0 && arr[j]>key;j--) {
				arr[j+1]=arr[j];
			}
			arr[j+1]=key;
			System.out.println(Arrays.toString(arr));
		}
		
		
	}
}
