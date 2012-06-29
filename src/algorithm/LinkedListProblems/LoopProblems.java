package LinkedListProblems;

import common.SLLNode;

/*
 Finding loop in the linkedList
 Finding loop length in the linkedList
 Finding loop starting point in the linkedList
 */

public class LoopProblems {

	SLLNode head;

	// Method for finding the loop
	public boolean isLoopExist() {

		if (head == null) {
			return false;
		}

		SLLNode aforward = head;
		SLLNode aBackword = head;

		while (aforward.next != null) {

			aforward = aforward.next;

			if (aforward.next == null) {
				System.out.println("LOOP DOES NOT EXIST");
				break;
			}

			aforward = aforward.next;
			aBackword = aBackword.next;

			if (aBackword.next == aforward.next) {
				System.out.println("LOOP EXIST");
				return true;
			}

		}

		return false;

	}

	// Method for finding the loop length
	public int findLoopLength() {

		SLLNode aforward = head;
		SLLNode aBackword = head;
		int count = -1;

		while (aforward.next != null) {

			aforward = aforward.next;

			if (aforward.next == null) {
				System.out.println("LOOP DOES NOT EXIST");
				break;
			}

			aforward = aforward.next;
			aBackword = aBackword.next;

			if (aBackword.next == aforward.next) {

				count = 1;

				aforward = aforward.next;

				while (aforward.next != aBackword.next) {
					System.out.println("DDD");
					aforward = aforward.next;
					count++;
				}
				break;

			}

		}

		return count;

	}

	// Method for finding the loop starting point
	public int findLoopStartingPointData() {

		SLLNode aforward = head;
		SLLNode aBackword = head;
		int count = -1;

		while (aforward.next != null) {

			aforward = aforward.next;

			if (aforward.next == null) {
				System.out.println("LOOP DOES NOT EXIST");
				break;
			}

			aforward = aforward.next;
			aBackword = aBackword.next;

			if (aBackword.next == aforward.next) {

				aBackword = head;

				while (aforward.next != aBackword.next) {

					aforward = aforward.next;
					aBackword = aBackword.next;

				}

				count = aBackword.next.getData(); // because aBackword.next is
													// the common for both not
													// the aBackword
				break;

			}

		}

		return count;

	}

	public static void main(String[] args) {

		LoopProblems linkedList = new LoopProblems();

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
		node6.setNext(node3);

		linkedList.head = node;

		if (linkedList.isLoopExist()) {

			System.out.println(linkedList.findLoopLength());
			System.out.println(linkedList.findLoopStartingPointData());
		}

	}
}
