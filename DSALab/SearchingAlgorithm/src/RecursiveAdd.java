

import java.util.Scanner;

public class RecursiveAdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number To Add Upto :");
		int n=sc.nextInt();
		int addition=add(n);
		if(addition!=-1) {
			System.out.println("Sum is :"+addition);
		}else {
			System.out.println("Not Valid Sum");
		}
	}

	private static int add(int n) {
		if(n<0) {
			return -1;
		}else if(n==1) {
			return 1;
		}else {
			return n+add(n-1);
		}
	}

}
