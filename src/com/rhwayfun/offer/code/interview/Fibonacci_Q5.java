package com.rhwayfun.offer.code.interview;

/**
 * 
 * <p>Title:Fibonacci_Q5</p>
 * <p>Description:
 * 斐波那契数列：写一个函数，输入n，求斐波那契数列的第n项，斐波那契数列定义如下：f(0)=0,f(1)=1,f(n)=f(n-1)+f(n-2)
 * </p>
 * @author rhwayfun
 * @date Sep 15, 2015 1:00:49 PM
 * @version 1.0
 */
public class Fibonacci_Q5 {

	public int fibonacci_1(int n){
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		return fibonacci_1(n - 1) + fibonacci_1(n - 2);
	}
	
	public int fibonacci_2(int n){
		//思路：依次计算f(0),f(1),f(2),f(3)，计算f(n)只需要将前两个的值想家即可得到结果
		int fibonacciOne = 0;
		int fibonacciTwo = 1;
		int res = 0;
		for (int i = 1; i < n; i++) {
			res = fibonacciOne + fibonacciTwo;
			fibonacciOne = fibonacciTwo;
			fibonacciTwo = res;
		}
		return res;
	}
}
