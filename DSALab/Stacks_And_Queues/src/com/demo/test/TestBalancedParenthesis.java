package com.demo.test;

import com.demo.beans.MyStringStack;

public class TestBalancedParenthesis {

	public static void main(String[] args) {
		MyStringStack ob= new MyStringStack(20);
		
		String str="([{[]}])";
		
		boolean status=checkBalancedParenthesis(str);
		if(status) {
			System.out.println("String is Balanced..!!");
		}
		else {
			System.out.println("String is Imbalanced..!!");
		}
	}

	private static boolean checkBalancedParenthesis(String str) {
		MyStringStack ob= new MyStringStack(str.length());
		for(int i=0; i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='(' || ch=='[' || ch=='{') {
				ob.push(ch);
			}else {
				if(ch==')' || ch==']' || ch=='}');{
					if(!ob.isEmpty()) {
						char ch1=ob.pop();
						if((ch==']' && ch1!='[') ||(ch=='}' && ch1!='{') ||(ch==')' && ch1!='(')) {
							return false;
						}
					}else {
						return false;
					}
					
				}
			}
		}if(ob.isEmpty()) 
			return true;
		else
			return false;
			
		
	}

}
