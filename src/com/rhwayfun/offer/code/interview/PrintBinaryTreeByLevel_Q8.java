package com.rhwayfun.offer.code.interview;

import java.util.ArrayDeque;
import java.util.Queue;


/**
 * 
 * <p>Title:PrintBinaryTreeFromByLevel_Q8</p>
 * <p>
 * Description:从上到下打印二叉树
 * 题目：从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 * </p>
 * @author rhwayfun
 * @date Sep 28, 2015 10:55:08 AM
 * @version 1.0
 */
public class PrintBinaryTreeByLevel_Q8 {

	//定义一颗二叉树
	public class BinaryTreeNode{
		int m_nValue;
		BinaryTreeNode m_pLeft;
		BinaryTreeNode m_Right;
	}
	
	//从上到下打印二叉树的方法
	public void printFromTopToBottom(BinaryTreeNode pRoot){
		if(pRoot == null){
			return;
		}
		//创建一个队列保存访问节点的左右节点
		Queue<BinaryTreeNode> queue = new ArrayDeque<BinaryTreeNode>();
		queue.offer(pRoot);
		while(queue.size() > 0){
			BinaryTreeNode frontNode = queue.peek();
			//每次获取队头的元素之后就移除该元素
			queue.poll();
			System.out.print(frontNode.m_nValue + " ");
			//如果当前节点有孩子节点，就把其孩子节点放入队列中
			if(frontNode.m_pLeft != null){
				queue.offer(frontNode.m_pLeft);
			}
			if(frontNode.m_Right != null){
				queue.offer(frontNode.m_Right);
			}
		}
	}
}
