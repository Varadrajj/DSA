package com.demo.beans;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GraphBFS {
	private int vertices;
	private boolean[][] adjmat;
	public GraphBFS(int vertices) {
		this.vertices=vertices;
		adjmat=new boolean[vertices][vertices];
	}
	public void addEdge(int i, int j) {
		adjmat[i][j]=true;
		adjmat[j][i]=true;
	}
	public void removeEdge(int i, int j) {
		adjmat[i][j]=false;
		adjmat[j][i]=false;
	}
	public void bfsTraversal(int n) {
		boolean[] visited=new boolean[vertices];
		Queue<Integer> vqueue=new LinkedList<>();
		for(int i=0; i<visited.length; i++) {
			visited[i]=false;
		}
		System.out.println(Arrays.toString(visited));
		int start=0;
		visited[start]=true;
		vqueue.add(start);
		while(vqueue.size()>0) {
			int path=vqueue.poll();
			System.out.print(path+",");
			for(int j=0; j<adjmat[path].length; j++) {
				if(adjmat[path][j]) {
					if(!visited[j]) {
						vqueue.add(j);
					}
					visited[j]=true;
				}
			}
			
		}
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
