package com.rhwayfun.offer.code.interview;

import java.util.Arrays;

/**
 * 
 * <p>Title:SquenceOfBST_Q9</p>
 * <p>
 * Description:二叉搜索树的后序遍历序列
 * 题目：输入一个整数数组，判断该数组是否为某二叉搜索树的的后序遍历的结果。是则返回true，否则返回false
 * </p>
 * @author rhwayfun
 * @date Sep 28, 2015 11:58:37 AM
 * @version 1.0
 */
public class SquenceOfBST_Q9 {

	/**
	 * 数组{5,7,6,9,11,10,8}
	 * 既然是后序遍历，那么根节点肯定在最后一位，所以8是根节点，又由于左子树的节点值都小于根节点，而右子树的节点值都大于根节点
	 * 所以5,7,6是左子树，而9,11,10则是右子树。对于左子树5,7,6,其根节点是6,5是其左节点，7是其右节点；对于右子树
	 * 9,11,10，10是根节点，而9是其左节点，11是其右节点
	 */
	
	public boolean isSquenceOfBST(int[] a,int len){
		if(a.length <=0 || a == null) return false;
		//根节点
		int pRoot = a[len - 1];
		//找到最后当前节点的左子树的下标
		int leftOfLast = 0;
		for (;leftOfLast < len - 1; ++leftOfLast) {
			if(a[leftOfLast] > pRoot) break;
		}
		//此时leftOflast所指示的下标就是当前节点左子树的所有节点的最后一个下标值
		int rightOfLast = leftOfLast;
		for (;rightOfLast < len - 1; ++rightOfLast) {
			if(a[rightOfLast] < pRoot) return false;
		}
		//判断左子树是否为二叉搜索树
		boolean isLeft = true;
		if(leftOfLast > 0) isLeft = isSquenceOfBST(a,leftOfLast);
		//判断右子树是否为二叉搜索树
		boolean isRight = true;
		int[] right = Arrays.copyOfRange(a, leftOfLast, len -1);
		if(leftOfLast < len - 1) isRight = isSquenceOfBST(right,right.length);
		return isLeft && isRight;
	}
}
