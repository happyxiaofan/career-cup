package com.rhwayfun.crack.code.interview;

public class RemoveNode {

	public boolean removeNode(ListNode2 pNode) {
		pNode = pNode.next;
		if (pNode == null) {
			return false;
		}
		return true;
	}
}

class ListNode2 {
	int val;
	ListNode2 next = null;

	ListNode2(int val) {
		this.val = val;
	}
}