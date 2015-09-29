package com.rhwayfun.offer.code.interview;

import java.util.Vector;

/**
 * 
 * <p>Title:PathInTree_Q7</p>
 * <p>
 * Description:二叉树中和为某一值的路径
 * 题目：输入一颗二叉树和一个整数，打印出二叉树节点值的和为输入整数的所有路径。从树的根节点开始往下一直到叶节点所经过的节点形成一条路径
 * </p>
 * @author rhwayfun
 * @date Sep 28, 2015 10:15:56 AM
 * @version 1.0
 */
public class PathInTree_Q7 {

	//定义一颗二叉树
	public class BinaryTreeNode{
		int m_nValue;
		BinaryTreeNode m_pLeft;
		BinaryTreeNode m_Right;
	}
	
	public void findPath(BinaryTreeNode pRoot,int expectedSum){
		if(pRoot == null){
			return;
		}
		//创建一个栈用于保存每次访问的节点
		Vector<Integer> path = new Vector<Integer>();
		//当前路径的节点累加和
		int currentSum = 0;
		findPath(pRoot,expectedSum,path,currentSum);
	}

	private void findPath(BinaryTreeNode pRoot, int expectedSum,
			Vector<Integer> path, int currentSum) {
		currentSum += pRoot.m_nValue;
		//把当前访问的节点（现在是根节点）
		path.add(pRoot.m_nValue);
		
		//如果不是叶子节点就遍历它的子节点
		if(pRoot.m_pLeft != null){
			findPath(pRoot.m_pLeft, expectedSum, path, currentSum);
		}
		if(pRoot.m_Right != null){
			findPath(pRoot.m_Right, expectedSum, path, currentSum);
		}
		
		//如果是叶子节点并且这条路径的节点累加和等于输入的整数，那么就打印输出
		if(pRoot.m_pLeft == null && pRoot.m_Right == null && currentSum == expectedSum){
			for (Integer node_nValue : path) {
				System.out.print(node_nValue + "\t");
			}
			System.out.println();
		}
		
		//如果遍历到叶子节点累加和不等于输入的整数，就回溯到该叶子节点的父节点
		path.remove(path.size() - 1);
	}
}
