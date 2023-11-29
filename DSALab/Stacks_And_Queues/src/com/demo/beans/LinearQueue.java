package com.demo.beans;

public class LinearQueue {
	private int[] quearr;
	private int rear;
	private int front;
	private int size;
	public LinearQueue() {
		quearr=new int[10];
		front=-1;
		rear=-1;
		size=10;
	}
	public LinearQueue(int n) {
		quearr=new int[n];
		size=n;
		front=-1;
		rear=-1;
	}
	public boolean isEmpty(){
		return front>rear;
	}
	public boolean isFull() {
		return rear==size-1;
	}
	public void enqueue(int n) {
		if(isFull()) {
			System.out.println("Queue is Full Cannot add");
		}else {
			front++;
			rear++;
			quearr[rear]=n;
			System.out.println("Element Added :"+n);
		}
	}
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Cannot Delete..Queue is Empty");
			return -1;
		}else {
			return quearr[front++];
		}
	}

}
