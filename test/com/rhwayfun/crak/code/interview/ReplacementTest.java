package com.rhwayfun.crak.code.interview;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.rhwayfun.crack.code.interview.Replacement;

public class ReplacementTest {

	Replacement replacement;
	@Before
	public void setUp() throws Exception {
		replacement = new Replacement();
	}

	@Test
	public void testReplaceSpace() {
		String s = replacement.replaceSpace("Hello  World", 13);
		System.out.println(s);
	}

}
