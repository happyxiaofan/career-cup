package com.rhwayfun.offer.code.interview;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 参考http://www.2cto.com/kf/201311/256909.html，在此表示感谢
 */
public class OutPutOneToMaxNDigits {
 
    public void outPutOneToMaxNDigits(int n) {
        // 用nlist表示数n,nlist[0]表示n的最低位
        ArrayList<Integer> nlist = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            nlist.add(0);
        }
        increment(nlist);
    }
 
    // 使数字每次+1然后输出
    public void increment(ArrayList<Integer> nlist) {
        int carrybit = 0;
        boolean end = false;
        while (true) {
            for (int i = nlist.size() - 1; i >= 0; i--) {
                int digit = nlist.get(i);
                int sum = digit + carrybit;
                if (i == (nlist.size() - 1)) {
                    sum += 1;
                }
                if (sum >= 10) {
                    // 最高位产生进位，达到最大值，停止输出
                    if (i == 0) {
                        end = true;
                    }
                    sum = sum - 10;
                    carrybit = 1;
                } else {
                    carrybit = 0;
                }
                nlist.set(i, sum);
            }
            output(nlist);
            if (end) {
                break;
            }
        }
    }
 
    // 输出数字，将高位的0舍掉
    public void output(ArrayList<Integer> nlist) {
        Iterator<Integer> ite = nlist.iterator();
        int num;
        // 找到第一个为0的位置
        boolean first = false;
        while (ite.hasNext()) {
            if (first) {
                System.out.print(ite.next());
                continue;
            }
            if ((num = ite.next()) != 0) {
                first = true;
                System.out.print(num);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        OutPutOneToMaxNDigits opt = new OutPutOneToMaxNDigits();
        opt.outPutOneToMaxNDigits(3);
         
    }
}