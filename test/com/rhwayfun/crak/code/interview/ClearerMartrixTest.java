package com.rhwayfun.crak.code.interview;

import org.junit.Before;
import org.junit.Test;

import com.rhwayfun.crack.code.interview.ClearerMartrix;

public class ClearerMartrixTest {

	private ClearerMartrix c;
	@Before
	public void setUp() throws Exception {
		c = new ClearerMartrix();
	}

	@Test
	public void testClearZero() {
		int[][] a = {{1,2,3},{0,1,2},{0,0,1}};
//		int[][] b = c.clearZero(a);
		int[][] b = c.cZero(a, 3);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}

}
