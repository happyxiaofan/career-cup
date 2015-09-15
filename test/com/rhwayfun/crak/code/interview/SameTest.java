package com.rhwayfun.crak.code.interview;

import org.junit.Before;
import org.junit.Test;

import com.rhwayfun.crack.code.interview.Same;

public class SameTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCheckSam() {
		Same same = new Same();
		System.out.println(same.checkSam("This is nowcoder", "is This nowcoder"));
		System.out.println(same.checkSam("Here you are", "Are you here"));
	}

	@Test
	public void testCheckSam2() {
		Same same = new Same();
		System.out.println(same.checkSam("This is nowcoder", "is This nowcoder"));
		System.out.println(same.checkSam("Here you are", "Are you here"));
	}
}
