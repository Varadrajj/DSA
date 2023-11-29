package com.demo.test;

import com.demo.beans.LinearQueue;

public class TestLinearQueue {

	public static void main(String[] args) {
		LinearQueue lq=new LinearQueue();
		lq.enqueue(10);
		lq.enqueue(20);
		while(lq.isEmpty()) {
			System.out.println(lq.dequeue());
		}

	}

}
