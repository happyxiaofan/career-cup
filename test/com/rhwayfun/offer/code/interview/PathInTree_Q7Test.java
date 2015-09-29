package com.rhwayfun.offer.code.interview;

import org.junit.Before;
import org.junit.Test;

import com.rhwayfun.offer.code.interview.PathInTree_Q7.BinaryTreeNode;

public class PathInTree_Q7Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFindPath() {
		PathInTree_Q7 pathInTreeQ7 = new PathInTree_Q7();
		
		//创建一颗二叉树
		BinaryTreeNode pRoot = pathInTreeQ7.new BinaryTreeNode();
		BinaryTreeNode pNode1 = pathInTreeQ7.new BinaryTreeNode();
		BinaryTreeNode pNode2 = pathInTreeQ7.new BinaryTreeNode();
		BinaryTreeNode pNode3= pathInTreeQ7.new BinaryTreeNode();
		BinaryTreeNode pNode4 = pathInTreeQ7.new BinaryTreeNode();
		pRoot.m_nValue = 10;
		pNode1.m_nValue = 5;
		pNode2.m_nValue = 12;
		pNode3.m_nValue = 4;
		pNode4.m_nValue = 7;
		pRoot.m_pLeft = pNode1;
		pRoot.m_Right = pNode2;
		pNode1.m_pLeft = pNode3;
		pNode1.m_Right = pNode4;
		
		pathInTreeQ7.findPath(pRoot, 22);
	}

}
