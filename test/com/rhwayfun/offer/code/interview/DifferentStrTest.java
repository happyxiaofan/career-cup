package com.rhwayfun.offer.code.interview;

import org.junit.Before;
import org.junit.Test;

import com.rhwayfun.crack.code.interview.DifferentStr;

public class DifferentStrTest {

	private DifferentStr d;
	@Before
	public void setUp() throws Exception {
		d = new DifferentStr();
	}

	@Test
	public void testCheckDifferent() {
		System.out.println(d.checkDifferent("BarackObama"));
	}

}
