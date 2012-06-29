package LinkedListProblems;

import common.SLLNode;

/*
 * 
 * FIND THE nth Node from end in a Single LinkedList
 */
public class FindNthNodefromLast {

	SLLNode head;

	public FindNthNodefromLast(int aData) {
		head = new SLLNode();
		head.setData(aData);

	}

	public int getElementFromLast(int position) {

		if (position < 0) {
			System.out.println("Invalid position");
			return -1;
		}

		SLLNode ahead = head;
		SLLNode anode = head;

		for (int i = 0; i < position - 1; i++) {
			if (ahead.next == null) {
				System.out.println("Invalid position");
				return -1;
			}
			ahead = ahead.next;
		}

		while (ahead.next != null) {
			ahead = ahead.next;
			anode = anode.next;

		}

		return anode.getData();

	}

	public static void main(String[] args) {

		FindNthNodefromLast linkedList = new FindNthNodefromLast(5);

		SLLNode node = new SLLNode();
		node.setData(6);

		SLLNode node1 = new SLLNode();
		node1.setData(7);

		SLLNode node2 = new SLLNode();
		node2.setData(8);

		SLLNode node3 = new SLLNode();
		node3.setData(9);

		SLLNode node4 = new SLLNode();
		node4.setData(10);

		SLLNode node5 = new SLLNode();
		node5.setData(11);

		SLLNode node6 = new SLLNode();
		node6.setData(12);

		node.setNext(node1);
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(node5);
		node5.setNext(node6);

		linkedList.head.next = node;

		System.out.println(linkedList.head);
		System.out.println(linkedList.getElementFromLast(4));

	}
}
