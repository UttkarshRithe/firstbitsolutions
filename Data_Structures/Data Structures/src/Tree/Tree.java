package Tree;

public class Tree {
	
	
	Node root;
	
	public Tree()
	{
		root=null;
	}
	
	public void insert(int ele)
	{
		root = insert(ele,root);
	}
	
	public Node insert(int  ele,Node temp)
	{
		if(temp==null)
		{
			return new Node(ele);
		}
		
		if(ele<temp.getData())
		{
			
		}
		
		
		return temp;
		
	}

}
