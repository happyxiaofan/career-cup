package com.rhwayfun.crack.code.interview;

/**
 * 
 * <p>Title:CrossLine</p>
 * <p>Description:
 * ��ֱ�����ϵ�ϵ�����ֱ�ߣ�ȷ��������ֱ�߻᲻���ཻ��
 * �߶���б�ʺͽؾ����ʽ�������double s1��double s2��double y1��double y2��
 * �ֱ���ֱ��1��2��б��(��s1,s2)�ͽؾ�(��y1,y2)��
 * �뷵��һ��bool�����������ֱ���Ƿ��ཻ��������ֱ���غ�Ҳ��Ϊ�ཻ��</p>
 * @author rhwayfun
 * @date Sep 9, 2015 3:55:31 PM
 * @version 1.0
 */
public class CrossLine {

	//3.14,1,3.14,2 ����false
	//0.89500,-0.89500,0.11900,0.11900 ����true
	public boolean checkCrossLine(double s1, double s2, double y1, double y2) {
		if(!equal(s1,s2)){
			if(!equal(y1, y2)){
				return false;
			}
			return true;
		}else{
			if(!equal(y1,y2)){
				return false;
			}
		}
		return true;
    }

	private boolean equal(double y1, double y2) {
		if((y1 - y2) > -0.00001 && (y1 - y2) < 0.00001){
			return true;
		}
		return false;
	}
}
