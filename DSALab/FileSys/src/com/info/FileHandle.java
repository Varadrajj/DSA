package com.info;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandle {
	
	public static void main(String[] args) throws IOException {
		String name1 = "C:\\files\\array1.txt";
		String name2 = "C:\\files\\array2.txt";
		String name3 = "C:\\files\\array3.txt";
		
		FileReader fr1 = new FileReader(name1);
		FileReader fr2 = new FileReader(name2);
		FileWriter fw = new FileWriter(name3);
			
		BufferedReader br1 = new BufferedReader(fr1);
		BufferedReader br2 = new BufferedReader(fr2);
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		String str1 = br1.readLine();
		String str2 = br2.readLine();
		
		
		while(str1 != null && str2 != null) {
				
			int a1 = Integer.parseInt(str1);
			int a2 = Integer.parseInt(str2);
			
			if(a1 < a2) {
				
				bw.write(str1);
				str1 = br1.readLine();
				bw.newLine();
				
			}else {
				
				bw.write(str2);
				str2 = br2.readLine();
				bw.newLine();
			}
			
		}
		
		while(str1 != null) {
			
			bw.write(str1);
			str1 = br1.readLine();
			bw.newLine();
			
		}
		while(str2 != null) {
			
			bw.write(str2);
			str2 = br2.readLine();
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br1.close();
		br2.close();
	}
}
