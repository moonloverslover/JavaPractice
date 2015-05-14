//There are n points on a 2D plan, find the k points that are closest to origin ( x=0, y=0)

//TODO

package com.boyi.careercupproblems;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class ClosestKpoints {

	public static void main(String[] args) {
		double[][] points ={{3,3},{8,9},{6,3},{11,10},{1,2},{4,2},{2,4},{3,4},{3,3},{5,6},{6,5},{7,7},{5,5}};
		
		Map<Integer,Double> dist = new HashMap<Integer, Double>();
		Queue<Double> z = new LinkedList<Double>();

		for (int i=0;i<points.length;i++){
			
			dist.put(i, Math.pow(points[i][0],2)+Math.pow(points[i][1],2));
			
			z.add(Math.pow(points[i][0],2)+Math.pow(points[i][1],2));
		}
		
		
        System.out.print(dist);
	}

}
