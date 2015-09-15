package com.rhwayfun.crack.code.interview;

/**
 * 
 * <p>Title:Clearer</p>
 * <p>Description:
 * ���дһ���㷨����MxN������ĳ��Ԫ��Ϊ0���������ڵ����������㡣
 * ��һ��MxN��int[][]����(C++��Ϊvector>)mat�;����
 * ����n���뷵����ɲ������int[][]����(C++��Ϊvector>)��
 * ��֤nС�ڵ���300�������е�Ԫ��Ϊint��Χ�ڡ�
 * </p>
 * @author rhwayfun
 * @date Sep 7, 2015 4:33:02 PM
 * @version 1.0
 */
public class ClearerMartrix {

	public int[][] clearZero(int[][] mat) {
		int m = mat.length;
		int n = mat[0].length;
		int[] zeroRows= new int[m];
		int[] zeroCols = new int[n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(mat[i][j] == 0){
					zeroRows[i] = 1;
					zeroCols[j] = 1;
				}
				
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(zeroRows[i] == 1 || zeroCols[j] == 1){
					mat[i][j] = 0;
				}
			}
		}
		return mat;
    }
	
	public int[][] cZero(int[][] mat,int n){
		int m = n;
		int n1 = n;
		int[] zeroRows= new int[m];
		int[] zeroCols = new int[n1];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n1; j++) {
				if(mat[i][j] == 0){
					zeroRows[i] = 1;
					zeroCols[j] = 1;
				}
				
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n1; j++) {
				if(zeroRows[i] == 1 || zeroCols[j] == 1){
					mat[i][j] = 0;
				}
			}
		}
		return mat;
	}
}
