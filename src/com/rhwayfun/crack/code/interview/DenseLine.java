package com.rhwayfun.crack.code.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class DenseLine {

	public double[] getLine(Point[] p, int n) throws Exception {
		if (n < 2 || p.length < 2)
			throw new Exception("wrong lenth");
		List<Double> kl = new ArrayList<Double>();
		List<Double> bl = new ArrayList<Double>();
		double k = 0;
		double b = 0;
		for (int i = 0; i < p.length; i++) {
			for (int j = i + 1; j < p.length; j++) {
				if (Math.abs(p[j].x - p[i].x) < 1e-6) {
					k = 0;
				} else {
					k = (p[j].y - p[i].y) / (p[j].x - p[i].x);
				}
				b = p[j].y - k * p[j].x;
				kl.add(k);
				bl.add(b);
			}
		}
		int[] kc = new int[kl.size()];
		int[] bc = new int[bl.size()];
		int m = 0;
		int r = 0;
		HashMap<Integer, Double> km = new HashMap<Integer, Double>();
		HashMap<Integer, Double> bm = new HashMap<Integer, Double>();
		for (Double k1 : kl) {
			kc[m] = count(kl, kl.get(m));
			km.put(kc[m], k1);
			m++;
		}
		for (Double b1 : bl) {
			bc[r] = count(bl, bl.get(r));
			bm.put(bc[r], b1);
			r++;
		}
		Arrays.sort(kc);
		Arrays.sort(bc);
		double[] res = new double[2];
		res[0] = km.get(kc[0]);
		res[1] = bm.get(bc[0]);
		return res;
	}

	private int count(List<Double> ks, double d) {
		int count = 0;
		for (int i = 0; i < ks.size(); i++) {
			if (Math.abs(d - ks.get(i)) < 1e-6) {
				count++;
			}
		}
		return count;
	}

	public class Point {
		int x;
		int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public Point() {
			this.x = 0;
			this.y = 0;
		}
	}

	public double[] getLine2(Point[] p, int n) {
		if (null == p || p.length < 2)
			throw new RuntimeException("Invalid Input");
		double k, b, max = 0;
		double[] res = new double[2];
		LinkedList<Point> used = new LinkedList<Point>();
		LinkedList<Point> notused = new LinkedList<Point>();
		for (int i = 0; i < p.length; i++) {
			notused.add(p[i]);
		}
		while (notused.size() >= 2) {
			Point p1 = notused.pop();
			Point p2 = notused.pop();
			used.add(p1);
			used.add(p2);
			if (Math.abs(p1.x - p2.x) < 1e-6)
				break;// 斜率不存在
			k = (p1.y - p2.y) / (p1.x - p2.x);
			b = p1.y - k * p1.x;
			Point tmp;
			int count = 2;
			while (!notused.isEmpty()) {
				tmp = notused.peek();
				if (Math.abs(k * tmp.x + b - tmp.y) < 1e-6) {// 可以认为该点在直线y=kx+b上
					count++;
					used.add(notused.pop());// 将该点从集合notused移动到used
				}
			}
			if (count > max) {
				max = count;
				res[0] = k;
				res[1] = b;
			}
		}
		return res;
	}
}
