package com.rhwayfun.offer.code.interview;

import org.junit.Before;
import org.junit.Test;

public class SquenceOfBST_Q9Test {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testIsSquenceOfBST() {
		SquenceOfBST_Q9 so = new SquenceOfBST_Q9();
		int[] a = {5,7,6,9,11,10,8};
		System.out.println(so.isSquenceOfBST(a,7));
	}
	
}
