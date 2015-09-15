package com.rhwayfun.crack.code.interview;

/**
 * 
 * <p>Title:LinkedListPartition</p>
 * <p>Description:
 * ��д���룬�Ը�ֵxΪ��׼������ָ�������֣�����С��x�Ľ�����ڴ��ڻ����x�Ľ��֮ǰ
 * ��һ�������ͷָ�� ListNode* pHead���뷵���������к�������ͷָ�롣ע�⣺�ָ��Ժ󱣳�ԭ�������˳�򲻱䡣
 * </p>
 * @author rhwayfun
 * @date Sep 9, 2015 3:50:51 PM
 * @version 1.0
 */
public class LinkedListPartition {

	public ListNode2 partition(ListNode2 pHead, int x) {
        ListNode2 beforeStart = null;
        ListNode2 beforeEnd = null;
        ListNode2 afterStart = null;
        ListNode2 afterEnd = null;
        
        ListNode2 curNode = pHead;
        
        while(curNode != null){
            ListNode2 pnext = curNode.next;
            if(curNode.val < x){//lt x
                if(beforeStart == null){
                    beforeStart = curNode;
                    beforeEnd = beforeStart;
                }else{
                    beforeEnd.next = curNode;
                    beforeEnd = curNode;
                }
            }else{//gt or equal x
                if(afterStart == null){
                    afterStart = curNode;
                    afterEnd = afterStart;
                }else{
                    afterEnd.next = curNode;
                    afterEnd = curNode;
                }
            }
            curNode = pnext;
        }//end while
        if(beforeStart != null){
            beforeEnd.next = afterStart;
            return beforeStart;
        }
        return afterStart;
    }
}
