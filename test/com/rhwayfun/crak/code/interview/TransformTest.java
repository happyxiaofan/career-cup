package com.rhwayfun.crak.code.interview;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TransformTest {

	private Transform t;
	@Before
	public void setUp() throws Exception {
		t = new Transform();
	}

	@Test
	public void testTransformImage() {
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] b = t.transformImage(a, 3);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}

}
