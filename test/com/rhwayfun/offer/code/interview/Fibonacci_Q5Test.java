package com.rhwayfun.offer.code.interview;

import org.junit.Before;
import org.junit.Test;

public class Fibonacci_Q5Test {

	private Fibonacci_Q5 fibonacciQ5;
	@Before
	public void setUp() throws Exception {
		fibonacciQ5 = new Fibonacci_Q5();
	}

	@Test
	public void testFibonacci_1() {
		System.out.println(fibonacciQ5.fibonacci_1(4));
	}

	@Test
	public void testFibonacci_2() {
		System.out.println(fibonacciQ5.fibonacci_2(4));
	}

}
