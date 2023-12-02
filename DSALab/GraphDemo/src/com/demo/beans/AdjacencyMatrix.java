package com.demo.beans;

public class AdjacencyMatrix {
	private int vertices;
	private boolean[][] adjmat;
	public AdjacencyMatrix(int vertices) {
		this.vertices=vertices;
		adjmat= new boolean[vertices][vertices];
	}
	public void addEdge(int i, int j) {
		adjmat[i][j]=true;
		adjmat[j][i]=true;
	}
	public void removeEdge(int i, int j) {
		adjmat[i][j]=false;
		adjmat[j][i]=false ;
	}
	public String toString() {
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<adjmat.length; i++) {
			for(int j=0; j<adjmat[i].length; j++) {
				sb.append((adjmat[i][j]?1:0)+"\t");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}
