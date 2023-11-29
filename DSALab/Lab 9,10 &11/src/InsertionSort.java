

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr= {5,4,6,8,1,2,9};
		System.out.println("Given Array :"+Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("Array After Sorting :"+Arrays.toString(arr));
	}

	private static void insertionSort(int[] arr) {
		int n=arr.length;
		for(int i=1; i<n; i++) {
			int key=arr[i];
			int j=i-1;
			for(;j>=0 && arr[j]>key; j--) {
				arr[j+1]=arr[j];
			}
			arr[j+1]=key;
			System.out.println(Arrays.toString(arr));
		}
		
	}

}
