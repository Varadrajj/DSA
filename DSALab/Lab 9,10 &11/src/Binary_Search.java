

import java.util.Scanner;

public class Binary_Search {

	public static void main(String[] args) {
		int[] arr= {2, 3, 3, 4, 4, 7, 9, 10, 12};
		System.out.println("Enter The Number For Searching...");
		Scanner sc=new Scanner(System.in);
		int search=sc.nextInt();
		int pos=binarySearch(arr, search);
		if(pos!=-1) {
			System.out.println("Element found At :"+pos);
		}else {
			System.out.println("Element Not Found...!!!");
		}

	}

	private static int binarySearch(int[] arr, int search) {
		int first=0, last=arr.length-1;
		int compcnt=0;
		while(first<=last) {
			int mid=(first+last)/2;
			compcnt++;
			if(arr[mid]==search) {
				System.out.println("Compare Count Is :"+compcnt);
				return mid;
			}else if(arr[mid]<search) {
				first=mid+1;
			}else {
				last=mid-1;
			}
		}
		System.out.println("Compare Count Is :"+compcnt);
		return -1;
	}

}
