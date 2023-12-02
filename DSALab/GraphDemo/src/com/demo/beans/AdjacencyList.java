package com.demo.beans;

public class AdjacencyList {
	private int vertices;
	private SinglyLinkedList[] graph;
	
	public AdjacencyList(int vertices) {
		super();
		this.vertices = vertices;
		graph=new SinglyLinkedList[vertices];
		for(int i=0;i<graph.length;i++) {
			graph[i]=new SinglyLinkedList();
		}
	}
	
	public void addEdge(int i,int j) {
		graph[i].addAtStart(j);
		graph[j].addAtStart(i);
	}
	
	public void removeEdge(int i,int j) {
		graph[i].addAtStart(j);
		graph[j].addAtStart(i);
	}
	
	public void displayGraph() {
		for(int i=0;i<graph.length;i++) {
			System.out.println(i+"--->");
			graph[i].display();
		}
	}
}
