package com.rhwayfun.offer.code.interview;

import java.util.Arrays;

/**
 * 
 * <p>Title:MergeArray_Q1</p>
 * <p>
 * Question:���������������A1��A2���ڴ���A1��ĩβ���㹻��Ŀ���ռ�����A2��
 * ��ʵ��һ�������A2���������ֲ��뵽A1�в������е������������
 * </p>
 * @author rhwayfun
 * @date Sep 5, 2015 6:57:13 PM
 * @version 1.0
 */
public class MergeArray_Q1 {

	public int[] merge(int[] A1, int[] A2){
		int len = A1.length + A2.length;
		int[] newArr = new int[len];
		for (int i = 0; i < A1.length; i++) {
			newArr[i] = A1[i];
		}
		for (int j = 0; j < A2.length; j++) {
			newArr[len -A2.length - j] = A2[j];
		}
		Arrays.sort(newArr);
		return newArr;
	}
}
