import java.util.Arrays;

public class HeapSort {
	public static void main(String[] args) {
		int[] arr= {65,35,26,13,23,12,91};
		System.out.println("Original Array= "+Arrays.toString(arr));
		
		heapSort(arr);
		System.out.println("Sorted Array= "+Arrays.toString(arr));
	}

	private static void heapSort(int[] arr) {
		int n=arr.length;
		
		//this will convert array into max heap
		for(int i=n/2-1;i>=0;i--) {
			heapify(arr,n,i);
		}
		System.out.println("Array= "+Arrays.toString(arr));
		
		for(int i=n-1;i>=0;i--) {
			int temp=arr[i];
			arr[i]=arr[0];
			arr[0]=temp;
			heapify(arr,i,0);
			System.out.println("size:"+i);
			System.out.println("Array 1= "+Arrays.toString(arr));
		}
		
		
	}

	private static void heapify(int[] arr, int n, int i) {
		int largest=i;
		int l=2*i+1;
		int r=2*i+2;
		if(l<n && arr[l]>arr[largest]) {
			largest=l;
		}
		if(r<n && arr[r]>arr[largest]) {
			largest=r;
		}
		if(largest!=i) {
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			heapify(arr,n,largest);
		}
		
		
		
	}

}
