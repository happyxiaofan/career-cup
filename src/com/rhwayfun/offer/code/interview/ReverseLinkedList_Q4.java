package com.rhwayfun.offer.code.interview;

import java.util.Stack;

/**
 * 
 * <p>Title:ReverseLinkedList_Q4</p>
 * <p>Description:
 * 题目：输入一个链表的头结点，从尾到头打印每个节点的值
 * </p>
 * @author rhwayfun
 * @date Sep 14, 2015 1:27:37 PM
 * @version 1.0
 */
public class ReverseLinkedList_Q4 {

	public void reverse(Node head){
		/*基本思路：从头结点开始，每次都把后一个节点放到链表的最前面
		*举例说明：1->2->3->4，设置一个指向当前节点的指针cur，以及当前节点下一个节点的指针pre
		*第一遍：2->1->3->4 cur指向1，pre指向2，Node pnext = pre.next;即pnext指向3,
			       执行pre.next = cur;cur = pnext;pnext = pre;一次结束
		*     主要就是把第二个节点的指针指向前一个节点，同时把当前节点移动一个位置
		*/
		Node cur = null;
		Node pre = null;
		Node pnext = null;
		cur = head;
		pre = cur.next;
		cur.next = null;
		while(pre!=null){
			pnext = pre.next;
			pre.next = cur;
			cur = pre;
			pre = pnext;
		}
		head = cur;
	}
	
	public void reverse2(Node head){
		Stack<Node> nodes = new Stack<Node>();
		Node cur = head;
		while(cur != null){
			nodes.push(cur);
			cur = cur.next;
		}
		while(!nodes.isEmpty()){
			System.out.println(nodes.pop());
		}
	}
	public class Node{
		int key;
		Node next;
		public Node(int key) {
			this.key = key;
			this.next = null;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return key+"";
		}
	}
	
	public static void main(String[] args) {
		ReverseLinkedList_Q4 rs = new ReverseLinkedList_Q4();
		Node node1 = rs.new Node(1);
		Node node2 = rs.new Node(2);
		Node node3 = rs.new Node(3);
		Node node4 = rs.new Node(4);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		rs.reverse(node1);
		System.out.println(node1.next);
	}
}
