package linkedlist.doublylinkedlist;

public class Node {

	int data;
	Node prev;
	Node next;
	
	public Node(int ele)
	{
		data=ele;
		next=null;
		prev=null;
		
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
}
