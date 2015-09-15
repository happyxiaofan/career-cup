package com.rhwayfun.crak.code.interview;

import org.junit.Before;
import org.junit.Test;

import com.rhwayfun.crack.code.interview.Bipartition;
import com.rhwayfun.crack.code.interview.Bipartition.Point;


public class BipartitionTest {

	Bipartition bipartition;
	@Before
	public void setUp() throws Exception {
		bipartition = new Bipartition();
	}

	@Test
	public void testGetBipartition() {
		Point[] A = {bipartition.new Point(0,0),bipartition.new Point(1,0),bipartition.new Point(1,1),bipartition.new Point(0,1)};
		Point[] B = {bipartition.new Point(1,0),bipartition.new Point(2,0),bipartition.new Point(2,1),bipartition.new Point(1,1)};
		double[] C = bipartition.getBipartition(A, B);
		for (double d : C) {
			System.out.println(d);
		}
	}

}
