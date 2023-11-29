package com.demo.beans;

import java.util.Arrays;

public class LinearQueue {
	private int[] arr;
	private int size;
	private int front;
	private int rear;
	
	public LinearQueue() {
		size=10;
		arr=new int[size];
		front=0;
		rear=-1;
	}
	
	public LinearQueue(int s) {
		size=s;
		arr=new int[size];
		front=0;
		rear=-1;
	}
	
	public boolean isFull() {
//		if(front==rear && front!=-1 && front!=0) {
//			front=-1;
//			rear=-1;
		return rear==size-1;
//		}
//		else
//			return false;
	}
	
	public boolean isEmpty() {
		
		return front>rear;
	}
	
	public void enqueue(int s) {
		if(isFull()) {
			//System.out.println(rear);
			System.out.println("Queue is Full..!!");
		}else {
//			if(front==-1) {
//				front=0;
//			}
			rear++;
			arr[rear]=s;
			System.out.println(s+" added in the queue..!!");
			
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty..!!");
			return -1;
		}else {
			rear--;
			int num=arr[0];
			for(int i=0;i<size-1;i++) {
				arr[i]=arr[i+1];
			}
			System.out.println(num+" element removed from queue..!!");
			return num;
		}
		
	}
	
//	public void display(){
//		for(int i=front;i<=rear;i++) {
//			System.out.println(arr[i]);
//		}
//		
//	}

	@Override
	public String toString() {
	
		return "LinearQueue [arr=" + Arrays.toString(arr) + ", front=" + front + ", rear=" + rear + "]";
	}
	
	
	
	
	
	

}
