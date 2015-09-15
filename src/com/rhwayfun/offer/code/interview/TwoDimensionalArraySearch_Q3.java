package com.rhwayfun.offer.code.interview;

/**
 * 
 * <p>Title:TwoDimensionalArraySearch_Q3</p>
 * <p>
 * Question:��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������
 * ÿһ�д��ϵ��µ�����˳�����С������һ��������������һ����ά�����һ
 * �������ж��������Ƿ���ڸ�����
 * </p>
 * @author rhwayfun
 * @date Sep 5, 2015 3:43:57 PM
 * @version 1.0
 */
public class TwoDimensionalArraySearch_Q3 {

	public boolean query(int[][] arr,int rows,int columns,int number){
		boolean found = false;
		int curRow = 0;
		int curCol = columns - 1;
		if(arr != null && rows > 0 && columns > 0){
			while(curRow < rows && curCol >= 0){
				
				//ȡ���Ͻǵ�һ��Ԫ�ؽ��бȽ�
				if(arr[curRow][curCol] == number){     //��һ�����������Ԫ�����
					found = true;
					break;
				}else if(arr[curRow][curCol] < number){//�ڶ�����������Ͻǵ�Ԫ�ر�Ҫ���ҵ�Ԫ��numberС
					curRow++;
				}else{						 	       //��������������Ͻǵ�Ԫ�ش���Ҫ���ҵ�Ԫ��number
					curCol--;
				}
			}
		}
		
		return found;
	}
}
