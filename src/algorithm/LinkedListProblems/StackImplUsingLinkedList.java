package LinkedListProblems;

import java.util.Stack;

import common.SNode;

/*
 IMPLEMENT THE STACK USING LINKEDLIST
 */

public class StackImplUsingLinkedList {

	SNode head;

	public StackImplUsingLinkedList(int aData) {
		head = new SNode();
		head.setData(aData);

	}

	public void push(int aData) {

		SNode node = new SNode();
		node.setData(aData);
		node.setNext(head);
		head = node;

		System.out.println(head);

	}

	public int pop() {
		int data;
		if (head.getNext() == null) {
			data = head.data;
			head = null;
		} else {
			data = head.data;
			head = head.next;

		}
		return data;
	}

	public static void main(String[] args) {

		Stack<Integer> inbuildStack = new Stack<Integer>();

		StackImplUsingLinkedList stack = new StackImplUsingLinkedList(1);
		stack.push(22);
		stack.push(22);
		stack.push(21);
		stack.push(23);
		stack.push(24);
		stack.push(22);

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
