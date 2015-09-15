package com.rhwayfun.crack.code.interview;

/**
 * 
 * <p>Title:Bipartition</p>
 * <p>Description:
 * 在二维平面上，有两个正方形，请找出一条直线，能够将这两个正方形对半分。假定正方形的上下两条边与x轴平行。
 * 给定两个vecotrA和B，分别为两个正方形的四个顶点。请返回一个vector，代表所求的平分直线的斜率和截距，保证斜率存在。
 * </p>
 * @author rhwayfun
 * @date Sep 9, 2015 6:00:58 PM
 * @version 1.0
 */
public class Bipartition {

	//[(0,0),(0,1),(1,1),(1,0)],[(1,0),(1,1),(2,0),(2,1)]，返回：[0.0，0.5]
    public double[] getBipartition(Point[] A, Point[] B) {
    	double centerA_x = 0;
    	double centerA_y = 0;
    	double centerB_x = 0;
    	double centerB_y = 0;
    	
    	for (int i = 0; i < 4; i++) {
			centerA_x += A[i].x;
			centerA_y += A[i].y;
			centerB_x += B[i].x;
			centerB_y += B[i].y;
		}
    	
    	centerA_x /= 4;
    	centerA_y /= 4;
    	centerB_x /= 4;
    	centerB_y /= 4;
    	
    	//计算斜率和截距
    	double[] res = new double[2];
    	res[0] = (centerB_y - centerA_y) / (centerB_x - centerA_x);
    	res[1] = centerA_y - res[0]*centerA_x;
		return res;
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
}
