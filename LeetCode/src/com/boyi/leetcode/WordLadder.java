//Given two words (start and end), and a dictionary, 
//find the length of shortest transformation sequence from start to end, such that:
//
//Only one letter can be changed at a time
//Each intermediate word must exist in the dictionary
//For example,
//
//Given:
//start = "hit"
//end = "cog"
//dict = ["hot","dot","dog","lot","log"]
//As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
//return its length 5.
//
//Note:
//Return 0 if there is no such transformation sequence.
//All words have the same length.
//All words contain only lowercase alphabetic characters.

// graph is changing because of color (G.adj should be constant) !!!! need to fix

package com.boyi.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class WordLadder {

	public Map<Vertex, ArrayList<Vertex>> generategraph(String[] dict, String start, String end) {
		Map<Vertex, ArrayList<Vertex>> graph = new HashMap<Vertex, ArrayList<Vertex>>();
		
		String[] allstr = new String[dict.length+2];

		for (int i=0;i<dict.length;i++) {
			allstr[i] = dict[i];
		}
		allstr[dict.length] = start;
		allstr[dict.length+1] = end;
		
		for (int i=0;i<allstr.length;i++) {
			ArrayList<Vertex> adj = new ArrayList<Vertex>();
			Vertex u = new Vertex(allstr[i]);
			for (int j=0;j<allstr.length;j++){
				if (i != j) {
					if(compare(allstr[i],allstr[j])) {
						Vertex v = new Vertex(allstr[j]);
						adj.add(v);
					}
				}	
			}
			graph.put(u, adj);
		}
		
		return graph;
	}
	
	public double shortestpath(String[] dict, String start, String end) {
		
		//Map<Vertex, ArrayList<Vertex>> graph = generategraph(dict,start,end);
		
		ArrayList<Vertex> pool = pool_init(start,end, dict);
    	System.out.println(pool.get(5).val);


	    Vertex s = new Vertex(start);
	    Vertex e = new Vertex(end);
	    int index = pool.indexOf(s);
    	System.out.println(index);

        s.color = "gray";
        s.distance = 0;
        s.p = null;
        
        updatepool(s,index,pool);
        
        Queue<Vertex> q = new LinkedList<Vertex>();
        q.add(s);
        
        while (!q.isEmpty()) {
        	Vertex u = q.remove();
        	ArrayList<Vertex> adj = adj(u,pool);
        	System.out.println(adj);
	        if (adj.size() >= 1) {	
        	    for (int i=0;i<adj.size();i++) {
        	    	 Vertex v = adj.get(i);
	        		if (v.color == "white") {
	        			int indexv = pool.indexOf(v);
	        			v.color = "gray";
	        			v.distance = u.distance+1;
	        			v.p = u;
	        			q.add(v);
	        			updatepool(v,indexv,pool);
	        		}
	        		if (v == e) {
	        			return v.distance+1;
	        		}
	        	}
	        }    
	        int indexu = pool.indexOf(u);
        	u.color = "black";
        	updatepool(u,indexu,pool);
        }
	
        return -1;
	}
	
	class Vertex {
		String color;
		double distance;
		Vertex p;
		String val;
		
		Vertex(String val) {
			color = "white";
			distance = Double.POSITIVE_INFINITY;
			p = null;
			this.val = val;
		}	
	}
	public ArrayList<Vertex> adj(Vertex u, ArrayList<Vertex> pool) {
		ArrayList<Vertex> adj = new ArrayList<Vertex>();
		
		for (int i=0;i<pool.size();i++) {
			
				if (compare(u.val, pool.get(i).val)) {
					adj.add(pool.get(i));
				}	
			
		}
		return adj;
	}
	
	public ArrayList<Vertex> pool_init(String start, String end, String[] dict) {
		ArrayList<Vertex> pool = new ArrayList<Vertex>();
		
		for (String str:dict) {
			Vertex v = new Vertex(str);
			pool.add(v);
		}
		Vertex vstart = new Vertex(start);
		Vertex vend = new Vertex(end);
		
		pool.add(vstart);
		pool.add(vend);
		
		
		return pool;

		
	}
	
	public void updatepool(Vertex vupdate, int index, ArrayList<Vertex> pool) {
		pool.set(index, vupdate);
	}
	
//	class Vertex {
//	boolean visited;
//	double distance;
//	Vertex p;
//	String val;
//	
//	Vertex(String val) {
//		visited = false;
//		distance = Double.POSITIVE_INFINITY;
//		p = null;
//		this.val = val;
//	}	
//}
	
	
	public boolean compare(String a, String b) {
		int n = 0;
		for (int i=0;i<3;i++) {
			if (a.charAt(i) == b.charAt(i)) {
				n++;
			}
		}
		if (n==2) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		WordLadder wl = new WordLadder();
		String start = "hit";
		String end = "cog";
		String[] dict = {"hot","dot","dog","lot","log"};
		System.out.println(wl.shortestpath(dict,start,end));
	}

}
