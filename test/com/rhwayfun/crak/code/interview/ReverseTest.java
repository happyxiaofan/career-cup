package com.rhwayfun.crak.code.interview;

import org.junit.Before;
import org.junit.Test;

import com.rhwayfun.crack.code.interview.Reverse;

public class ReverseTest {

	private Reverse reverse;
	@Before
	public void setUp() throws Exception {
		reverse = new Reverse();
	}

	@Test
	public void testReverseString() {
		System.out.println(reverse.reverseString("This is nowcoder"));
	}

}
