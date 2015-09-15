package com.rhwayfun.crack.code.interview;

/**
 * 
 * <p>Title:AddSubstitution</p>
 * <p>Description:
 * 请编写一个方法，实现整数的乘法、减法和除法运算(这里的除指整除)。只允许使用加号。
 * 给定两个正整数int a,int b,同时给定一个int type代表运算的类型，1为
 * 求a ＊ b，0为求a ／ b，-1为求a － b。请返回计算的结果，保证数据合法且结果一定在int范围内。
 * </p>
 * @author rhwayfun
 * @date Sep 9, 2015 4:48:07 PM
 * @version 1.0
 */
public class AddSubstitution {

	//1,2,1 返回2
	public int calc(int a, int b, int type) throws Exception {
		if(type !=-1 && type != 0 && type != 1){
			throw new Exception("wrong type!");
		}
		int res = 0;
		switch (type){
			case -1:
				res = a + (-b);
				break;
			case 0:
				res = divide(a,b);
				break;
			case 1:
				res = multi(a,b);
				break;
		}
		return res;
    }

	private int multi(int a, int b) {
		int res = a;
		for (int i = 1; i < b; i++) {
			res += a;
		}
		return res;
	}

	private int divide(int a, int b) throws Exception {
		if(b == 0)
			throw new Exception(a + " can't be divided by 0");
		int c = 0;
		while(a >= b){
			a -= b;
			c++;
		}
		return c;
	}

	private int minus(int a, int b) {
		int rb = (~b) + 1;
		return a + rb;
	}
}
