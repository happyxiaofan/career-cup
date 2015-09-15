package com.rhwayfun.crak.code.interview;

import org.junit.Before;
import org.junit.Test;

import com.rhwayfun.crack.code.interview.Ants;

public class AntsTest {

	Ants ants;
	@Before
	public void setUp() throws Exception {
		ants = new Ants();
	}

	@Test
	public void testAntsCollision() {
		System.out.println(ants.antsCollision(3));
	}

}
