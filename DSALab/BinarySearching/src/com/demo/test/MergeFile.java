package com.demo.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class MergeFile {

	public static void main(String[] args) {
		int[] arr1= new int[6];
		int[] arr2= new int[5];
		int x=0,y=0;
		try(BufferedReader br1=new BufferedReader(new FileReader("File1.txt"));
			BufferedReader br2=new BufferedReader(new FileReader("File2.txt"));) {
			
			while(br1.ready()) {
				int ar1= Integer.parseInt(br1.readLine());
				arr1[x]=ar1;
				x++;
			}
			System.out.println("Array 1= "+Arrays.toString(arr1));
			
			while(br2.ready()) {
				int ar2=Integer.parseInt(br2.readLine());
				arr2[y]=ar2;
				y++;
			}
			System.out.println("Array 2= "+Arrays.toString(arr2));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		int[] arr3= new int[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				arr3[k]=arr1[i];
				i++;
				k++;
			}
			else {
				arr3[k]=arr2[j];
				j++;
				k++;
			}
			
		}
		while(i<arr1.length) {
			arr3[k]=arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			arr3[k]=arr2[j];
			j++;
			k++;
		}
		
		try(FileWriter fw= new FileWriter("File3.txt");){
			int n=arr3.length;
			for(int l=0;l<n;l++) {
				fw.write(arr3[l]+" \n");
			}
			System.out.println("File Merged Sucessfully!!!");
		}catch(IOException e){
			e.printStackTrace();
		}
		

	}

}
