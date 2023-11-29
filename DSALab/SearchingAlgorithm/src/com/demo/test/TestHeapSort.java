package com.demo.test;

import java.util.Arrays;

public class TestHeapSort {

	public static void main(String[] args) {
		int[] arr= {56,25,87,47,96,75,14,25,44};
		System.out.println("Given Array is :"+Arrays.toString(arr));
		heapsort(arr);
		System.out.println("Heap Sorted Array is :"+Arrays.toString(arr));
	}

	private static void heapsort(int[] arr) {
		int n=arr.length;
		for(int i=n/2-1; i>=0; i--) {
			heapify(arr,n,i);
		}
		System.out.println(Arrays.toString(arr));
		for(int i=n-1; i>=0; i--) {
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);
			System.out.println("Size :"+i);
			System.out.println(Arrays.toString(arr));
		}
		
	}

	private static void heapify(int[] arr, int n, int i) {
		int largest=i;
		int l=(2*i)+1;
		int r=(2*i)+2;
		if(l<n && arr[l]>arr[largest]) {
			largest=l;
		}
		if(r<n && arr[r]>arr[largest]) {
			largest=r;
		}
		if(largest!=i) {
			int temp=arr[largest];
			arr[largest]=arr[i];
			arr[i]=temp;
			heapify(arr,n,largest);
		}
		
	}

}
