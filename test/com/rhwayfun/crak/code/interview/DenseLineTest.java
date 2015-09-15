package com.rhwayfun.crak.code.interview;

import org.junit.Before;
import org.junit.Test;

import com.rhwayfun.crack.code.interview.DenseLine;
import com.rhwayfun.crack.code.interview.DenseLine.Point;

public class DenseLineTest {

	DenseLine d;
	@Before
	public void setUp() throws Exception {
		d = new DenseLine();
	}

	@Test
	public void testGetLine() throws Exception {
		Point[] a = {d.new Point(0,0),d.new Point(1,0),d.new Point(1,1),d.new Point(2,2)};
		double[] res = d.getLine(a, 4);
		for (double d : res) {
			System.out.println(d);
		}
	}
	
	@Test
	public void test(){
		Point[] p = {d.new Point(0,0),d.new Point(1,0),d.new Point(1,1),d.new Point(2,2)};
		double[] res = d.getLine2(p, 4);
		for (double d : res) {
			System.out.println(d);
		}
	}

}
