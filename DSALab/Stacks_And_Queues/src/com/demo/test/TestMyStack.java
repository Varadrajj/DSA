package com.demo.test;

import com.demo.beans.MyStack;

public class TestMyStack {

	public static void main(String[] args) {
		MyStack ob=new MyStack(5);
		ob.push(1);
		ob.push(4);
		ob.push(6);
		ob.push(8);
		ob.push(9);
		ob.push(2);
		while(!ob.isEmpty()) {
			System.out.println(ob.pop());
		}

	}

}
