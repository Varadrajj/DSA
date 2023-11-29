package com.demo.test;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {4,2,8,6,9,1,3,5,7};
		System.out.println("Original Array= "+Arrays.toString(arr));
		
		selectionSort(arr);
		System.out.println("Sorted Array= "+Arrays.toString(arr));
	}

	private static void selectionSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int min_index=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min_index]) {
					min_index=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min_index];
			arr[min_index]=temp;
			System.out.println(Arrays.toString(arr));
		}
		
	}

}
