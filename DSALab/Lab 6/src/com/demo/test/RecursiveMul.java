package com.demo.test;

import java.util.Scanner;

public class RecursiveMul {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number To Find Factorial :");
		int n=sc.nextInt();
		int fac=fact(n);
		if(fac!=-1) {
			System.out.println("Factorial Is :"+fac);
		}else {
			System.out.println("Not Valid Number To Find Factorial");
		}
		sc.close();
	}

	private static int fact(int n) {
		if(n<0) {
			return -1;
		}else if(n==1) {
			return 1;
		}else {
			return n*fact(n-1);
		}
	}
	

}
