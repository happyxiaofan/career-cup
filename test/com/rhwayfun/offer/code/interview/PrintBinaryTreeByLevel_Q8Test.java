package com.rhwayfun.offer.code.interview;

import org.junit.Before;
import org.junit.Test;

import com.rhwayfun.offer.code.interview.PrintBinaryTreeByLevel_Q8.BinaryTreeNode;

public class PrintBinaryTreeByLevel_Q8Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPrintFromTopToBottom() {
		PrintBinaryTreeByLevel_Q8 pbt = new PrintBinaryTreeByLevel_Q8();
		//创建一颗二叉树
		BinaryTreeNode pRoot = pbt.new BinaryTreeNode();
		BinaryTreeNode pNode1 = pbt.new BinaryTreeNode();
		BinaryTreeNode pNode2 = pbt.new BinaryTreeNode();
		BinaryTreeNode pNode3= pbt.new BinaryTreeNode();
		BinaryTreeNode pNode4 = pbt.new BinaryTreeNode();
		pRoot.m_nValue = 10;
		pNode1.m_nValue = 5;
		pNode2.m_nValue = 12;
		pNode3.m_nValue = 4;
		pNode4.m_nValue = 7;
		pRoot.m_pLeft = pNode1;
		pRoot.m_Right = pNode2;
		pNode1.m_pLeft = pNode3;
		pNode1.m_Right = pNode4;
		
		pbt.printFromTopToBottom(pRoot);
	}

}
