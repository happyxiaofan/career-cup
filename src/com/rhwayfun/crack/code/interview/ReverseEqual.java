package com.rhwayfun.crack.code.interview;

/**
 * 
 * <p>Title:ReverseEqual</p>
 * <p>Description:
 * �ٶ����Ƕ�֪���ǳ���Ч���㷨�����һ�������Ƿ�Ϊ�����ַ���Ӵ����뽫����㷨��д��һ������
 * �������ַ�s1��s2�����д������s2�Ƿ�Ϊs1��ת��ɣ�Ҫ��ֻ�ܵ���һ�μ���Ӵ��ĺ���
 * �������ַ�s1,s2,�뷵��boolֵ���s2�Ƿ���s1��ת��ɡ��ַ����ַ�ΪӢ����ĸ�Ϳո�
 * ��ִ�Сд���ַ���С�ڵ���1000��
 * </p>
 * @author rhwayfun
 * @date Sep 7, 2015 5:13:10 PM
 * @version 1.0
 */
public class ReverseEqual {

	/**
	 * "Hello world","worldhello "���أ�false "waterbottle","erbottlewat"���أ�true
	 * @Description: TODO
	 * @param s1
	 * @param s2
	 * @return boolean  
	 */
	public boolean checkReverseEqual(String s1, String s2) {
		StringBuilder builder = new StringBuilder(s1);
		char[] a = s1.toCharArray();
		for (char c : a) {
			if(builder.toString().indexOf(s2) != -1){
				return true;
			}
			builder.append(c);
		}
		return false;
    }
}
