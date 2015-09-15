package com.rhwayfun.crak.code.interview;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.rhwayfun.crack.code.interview.AddSubstitution;

public class AddSubstitutionTest {

	AddSubstitution addSubstitution;
	@Before
	public void setUp() throws Exception {
		addSubstitution = new AddSubstitution();
	}

	@Test
	public void testCalc() throws Exception {
		System.out.println(addSubstitution.calc(5668,9072,-1));
	}

}
