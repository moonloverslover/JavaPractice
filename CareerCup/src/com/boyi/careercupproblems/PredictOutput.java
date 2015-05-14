//Can you predict the output of the following code?
//
//
//for (int i = 0; i < 101; i++) {
//			if (i % 2 == 0) {
//				System.err.print(i);
//			} else
//				System.out.print(i);
//		}

package com.boyi.careercupproblems;

public class PredictOutput {

	public static void main(String[] args) {
		
		for (int i = 0; i < 101; i++) {
			if (i % 2 == 0) {
				System.err.print(i);    // what is err?
			} else
				System.out.print(i);
		}
		
// System.out.print(2%2);
	}

}
