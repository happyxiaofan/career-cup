package com.rhwayfun.crack.code.interview;

import java.util.Arrays;

/**
 * 
 * <p>Title:Same</p>
 * <p>Description:
 * �������ַ����д����ȷ������һ���ַ���ַ��������к��ܷ�����һ���ַ�
 * ����涨��СдΪ��ͬ�ַ��ҿ����ַ��ص�ո񡣸�һ��string stringA��һ��
 * string stringB���뷵��һ��bool����������Ƿ��������к����ͬ����֤�����ĳ��ȶ�С�ڵ���5000��</p>
 * @author rhwayfun
 * @date Sep 7, 2015 3:46:26 PM
 * @version 1.0
 */
public class Same {

	//"This is nowcoder","is This nowcoder"
	public boolean checkSam(String stringA, String stringB) {
		String[] s1 = stringA.split(" ");
		String[] s2 = stringB.split(" ");
		if(s1.length == s2.length){
			int count = 0;
			for (String sB : s2) {
				for (String sA : s1) {
					if(sA.equals(sB)){
						count++;
						break;
					}
				}
			}
			if(count == s2.length){
				return true;
			}
		}
		return false;
    }
	
	public boolean checkSam2(String stringA, String stringB) {
		char[] a = stringA.toCharArray();
		char[] b = stringB.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if(new String(a).equals(new String(b))){
			return true;
		}
		return false;
	}
}
