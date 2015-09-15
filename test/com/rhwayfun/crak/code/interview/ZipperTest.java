package com.rhwayfun.crak.code.interview;

import org.junit.Before;
import org.junit.Test;

import com.rhwayfun.crack.code.interview.Zipper;

public class ZipperTest {

	Zipper zipper;
	@Before
	public void setUp() throws Exception {
		zipper = new Zipper();
	}

	@Test
	public void testZipString() {
		System.out.println("welcometonowcoderrrrr");
		System.out.println("welcometonowcoderrrrr".length());
		System.out.println(zipper.zipString("welcometonowcoderrrrr"));
		System.out.println(zipper.zipString("welcometonowcoderrrrr").length());
	}

}
