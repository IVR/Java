package common;

public class SNode {

	public int data;

	public SNode next;
	

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public SNode getNext() {
		return next;
	}

	public void setNext(SNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "SNode [data=" + data + ", next=" + next + "]";
	}
	
	
	

}
