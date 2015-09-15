package com.rhwayfun.offer.code.interview;

/**
 * 
 * <p>Title:Singleton_Q2</p>
 * <p>
 * Question:���һ���࣬����ֻ����ɸ����һ��ʵ��
 * </p>
 * @author rhwayfun
 * @date Sep 5, 2015 3:47:26 PM
 * @version 1.0
 */
public class Singleton_Q2 {

	//�����췽��˽�л�
	private Singleton_Q2(){}
	
	//����һ��ʵ��
	private static Singleton_Q2 ins = new Singleton_Q2();
	
	public static Singleton_Q2 instnce(){
		return ins;
	}
	
}
