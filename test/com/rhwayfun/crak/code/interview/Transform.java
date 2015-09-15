package com.rhwayfun.crak.code.interview;

/**
 * 
 * <p>Title:Transform</p>
 * <p>Description:
 * ��һ����NxN�����ʾ��ͼ������ÿ��������һ��int��ʾ�����дһ���㷨��
 * �ڲ�ռ�ö����ڴ�ռ�������(����ʹ�û������)����ͼ��˳ʱ����ת90�ȡ�
 * ��һ��NxN�ľ��󣬺;���Ľ���N,�뷵����ת���NxN����,��֤NС�ڵ���500��ͼ��Ԫ��С�ڵ���256��
 * </p>
 * @author rhwayfun
 * @date Sep 7, 2015 4:14:40 PM
 * @version 1.0
 */
public class Transform {

	public int[][] transformImage(int[][] mat, int n) {
		int[][] b = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				b[j][n - i - 1] = mat[i][j];
			}
		}
		return b;
    }
}
