package Tree.problems.MeetingScheduling;
public class Node {

	Meeting data;
	Node left;
	Node right;
	
	public Node(Meeting ele)
	{
		this.data=ele;
		left=null;
		right=null;
	}

	public Meeting getData() {
		return data;
	}

	public void setData(Meeting data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
	
	
	
}

