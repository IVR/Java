package LinkedListProblems;

import common.SNode;

/*
 * 
 * FIND THE nth Node from end in a Single LinkedList
 */
public class FindNthNodefromLast {

	SNode head;

	public FindNthNodefromLast(int aData) {
		head = new SNode();
		head.setData(aData);

	}

	public int getElementFromLast(int position) {

		if (position < 0) {
			System.out.println("Invalid position");
			return -1;
		}

		SNode ahead = head;
		SNode anode = head;

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

		SNode node = new SNode();
		node.setData(6);

		SNode node1 = new SNode();
		node1.setData(7);

		SNode node2 = new SNode();
		node2.setData(8);

		SNode node3 = new SNode();
		node3.setData(9);

		SNode node4 = new SNode();
		node4.setData(10);

		SNode node5 = new SNode();
		node5.setData(11);

		SNode node6 = new SNode();
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
