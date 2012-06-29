package common;

//Single LinkedList Node
public class SLLNode {

	public int data;

	public SLLNode next;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public SLLNode getNext() {
		return next;
	}

	public void setNext(SLLNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "SNode [data=" + data + ", next=" + next + "]";
	}

}
