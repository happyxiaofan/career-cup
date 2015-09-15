package com.rhwayfun.offer.code.interview;

/**
 * 
 * <p>Title:MinRotateArray_Q6</p>
 * <p>Description:
 * 把一个数组最开始的若干元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为数组{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * </p>
 * @author rhwayfun
 * @date Sep 15, 2015 1:16:33 PM
 * @version 1.0
 */
public class MinRotateArray_Q6 {

	public int min(int[] k,int n){
		//第一个有序数组的下标
		int indexLow = 0;
		//第二个有序数组的下标
		int indexHigh = k.length - 1;
		//两个有序数组的指向的中间元素的下标
		int indexMid = indexLow;
		//如果indexLow小于indexHigh，就执行二分查找
		while(indexLow < indexHigh){
			//如果两个元素的距离为1，那么indexHigh位置的元素就是最小值
			if((indexHigh - indexLow) == 1){
				indexMid = indexHigh;
				break;
			}
			indexMid = (indexLow + indexHigh)/2;
			//考虑数组{1,0,1,1,1}和旋转数组{0,1,1,1,1}
			if(k[indexLow] == k[indexHigh] && k[indexMid] == k[indexHigh]){
				int mid = midOrder(k,indexLow,indexHigh);
				return mid;
			}
			if(k[indexMid] >= k[indexLow]){
				indexLow = indexMid;
			}else if(k[indexMid] <= k[indexHigh]){
				indexHigh = indexMid;
			}
		}
		return k[indexMid];
	}

	private int midOrder(int[] k, int indexLow, int indexHigh) {
		int res = k[indexLow];
		for (int i = indexLow + 1; i < indexHigh; i++) {
			if(res > k[i]){
				res = k[i];
			}
		}
		return res;
	}
}
