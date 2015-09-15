package com.rhwayfun.crack.code.interview;

/**
 * 
 * <p>Title:Ants</p>
 * <p>Description:
 * ��n������Ķ��������nֻ���ϣ���Щ����ͬʱ��ʼ���Ŷ���εı����У��������Щ������ײ�ĸ��ʡ�
 * (�������ײ��ָ����������ֻ���ϻ���ײ)
 * ��һ��int n(3<=n<=10000)�����n���κ�nֻ���ϣ��뷵��һ��double��Ϊ��ײ�ĸ��ʡ�
 * </p>
 * @author rhwayfun
 * @date Sep 9, 2015 4:12:57 PM
 * @version 1.0
 */
public class Ants {

	//n = 3 ����0.75
	public double antsCollision(int n) {
		double sum = pow(n);
		return 1.0 - 2/sum;
    }

	private double pow(int n) {
		double sum = 1.0;
		for (int i = 0; i < n; i++) {
			sum *= 2;
		}
		return sum;
	}
}
