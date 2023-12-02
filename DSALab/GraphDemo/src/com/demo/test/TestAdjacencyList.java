package com.demo.test;

import com.demo.beans.AdjacencyList;

public class TestAdjacencyList {

	public static void main(String[] args) {
		AdjacencyList ob=new AdjacencyList(5);
		ob.addEdge(0, 1);
		ob.addEdge(0,2);
		ob.addEdge(1, 3);
		ob.addEdge(2,3);
		ob.addEdge(2, 4);
		ob.displayGraph();

	}

}
