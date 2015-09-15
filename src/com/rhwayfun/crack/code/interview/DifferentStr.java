package com.rhwayfun.crack.code.interview;

/**
 * 
 * <p>Title:DifferentStr</p>
 * <p>
 * Description:��ʵ��һ���㷨��ȷ��һ���ַ�������ַ��Ƿ�ȫ����ͬ��
 * ��������Ҫ������ʹ�ö���Ĵ洢�ṹ����һ��string iniString��
 * �뷵��һ��boolֵ,True��������ַ�ȫ����ͬ��False��������ͬ���ַ�
 * ��֤�ַ��е��ַ�ΪASCII�ַ��ַ�ĳ���С�ڵ���3000����������
 * "aeiou"
 * ���أ�True
 * "BarackObama"
 * ���أ�False
 * </p>
 * @author rhwayfun
 * @date Sep 5, 2015 6:44:29 PM
 * @version 1.0
 */
public class DifferentStr {

	public boolean checkDifferent(String iniString) {
		String tmp = null;
        for (tmp = iniString; tmp.length() > 0;) {
			int i = 0;
			for(int j = i + 1; j < tmp.length(); j++){
				if(tmp.charAt(i) == tmp.charAt(j)){
					return false;
				}
			}
			i++;
			tmp = tmp.substring(i);
		}
		return true;
    }
}
