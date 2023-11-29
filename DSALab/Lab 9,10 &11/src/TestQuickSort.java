

import java.util.Arrays;

public class TestQuickSort {

	public static void main(String[] args) {
		int[] arr= {56,23,45,12,89,11,13,99};
		System.out.println("Given Array :"+Arrays.toString(arr));
		quicksort(arr,0,arr.length-1);
		System.out.println("Array After Sorted :"+Arrays.toString(arr));
	}

	private static void quicksort(int[] arr, int start, int end) {
		if(start<end) {
			int p=partition(arr,start,end);
			quicksort(arr,start,p-1);
			quicksort(arr,p+1,end);
		}
	}

	private static int partition(int[] arr, int first, int last) {
		int i=first;
		int j=last;
		int pivot=first;
		while(i<j) {
			while(i<last && arr[i]<=arr[pivot]) {
				i++;
			}
			while(j>first && arr[j]>=arr[pivot]) {
				j--;
			}
			if(i<j) {
			int temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
			}
		}
		int temp=arr[pivot];
		arr[pivot]=arr[j];
		arr[j]=temp;
		
		return j;
	}

}
