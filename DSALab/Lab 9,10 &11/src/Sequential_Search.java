

import java.util.Scanner;

public class Sequential_Search {

	public static void main(String[] args) {
//		System.out.println("Enter Size Of Array");
		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
		int[] arr= {3, 4, 12, 10, 4, 3, 2, 7, 9};
		//acceptData(arr);
		System.out.println("Enter Element For Searching...");
		int search=sc.nextInt();
		int pos=linearSearch(arr, search);
		if(pos!=-1) {
			System.out.println("Element Found at "+pos);
		}else {
			System.out.println("Element Not Found!!!");
		}
	}

	private static int linearSearch(int[] arr, int search) {
		int comparecnt=0;
		for(int i=0; i<arr.length; i++) {
			comparecnt++;
			if(arr[i]==search) {
				System.out.println("Compare Coun Is :"+comparecnt);
				return i;
			}
		}
		return -1;
	}

	private static void acceptData(int[] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter Element At "+i);
			arr[i]=sc.nextInt();
		}
		
	}

}
