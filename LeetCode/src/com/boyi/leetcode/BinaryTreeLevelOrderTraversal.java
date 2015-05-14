//Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
//
//For example:
//Given binary tree {3,9,20,#,#,15,7},
//    3
//   / \
//  9  20
//    /  \
//   15   7
//return its level order traversal as:
//[
//  [3],
//  [9,20],
//  [15,7]
//]


package com.boyi.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

		
	public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {  
        
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();  
        if (root == null)  
            return result;  
        Queue<TreeNode> queue = new LinkedList<TreeNode>();  
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();  
          
        //初始化先放入根结点到队列中, 为第一层结点  
        queue.add(root);  
          
        //这里采取一层层的方式加入到队列中  
        while (!queue.isEmpty()){  
            ArrayList<TreeNode> tempList = new ArrayList<TreeNode>();  
            ArrayList<Integer> tempValueList = new ArrayList<Integer>();  
              
            //先取出队列中的所有结点，因为它们是属于同一个层次的,并把这一层结点对应的ArrayList<Integer>值加入到list中。  
            while (!queue.isEmpty()){  
                TreeNode node = queue.remove();  
                tempList.add(node);  
                tempValueList.add(node.val);  
            }  
            list.add(tempValueList);  
              
            //对刚取出的这一个层次的下一个层次进行遍历加入到队列中。  
            for (int i=0; i<tempList.size(); ++i){  
                TreeNode node = tempList.get(i);  
                if (node.left != null){  
                    queue.add(node.left);  
                }  
                if (node.right != null){  
                    queue.add(node.right);  
                }  
            }  
        }  
          
        //结果List的翻转  
        for (int i=list.size()-1; i>=0; --i){  
            result.add(list.get(i));  
        }  
        return result;  
    }  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
