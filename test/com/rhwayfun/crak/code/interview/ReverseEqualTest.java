package com.rhwayfun.crak.code.interview;

import org.junit.Before;
import org.junit.Test;

import com.rhwayfun.crack.code.interview.ReverseEqual;

public class ReverseEqualTest {

	private ReverseEqual reverseEqual;
	@Before
	public void setUp() throws Exception {
		reverseEqual = new ReverseEqual();
	}

	@Test
	public void testCheckReverseEqual() {
		//System.out.println(reverseEqual.checkReverseEqual("Hello world", "worldhello "));
		System.out.println(reverseEqual.checkReverseEqual("waterbottle", "erbottlewat"));
	}

	@Test
	public void testCheckReverseEqual2() {
		StringBuilder s = new StringBuilder("abc");
		s.append('d');
		//System.out.println(s.toString());
		System.out.println(s.toString().indexOf("bc"));
	}
}
