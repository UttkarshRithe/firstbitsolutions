package linkedlist.doublylinkedlist.problems.sortingWhileinserting;

import linkedlist.doublylinkedlist.Node;

public class DoublyLinkedlist {

	Node start;
	int count;
	
	public DoublyLinkedlist()
	{
		start=null;
		count=0;
	}
	
	boolean isEmpty()
	{
		if(start==null)
			return true;
		else
			return false;
	}
	
	public void insert(int ele)
	{
		Node newNode=new Node(ele);
		Node temp = start;
		
		if(isEmpty())
		{
			start=newNode;
			temp = start;
			this.count++;
			return;
		}
		
		temp = newNode;
		
		while(temp.getPrev()!=null&&temp.getData()<temp.getPrev().getData())
		{
			
			int x =temp.getData();
			temp.setData(temp.getPrev().getData());
			temp.getPrev().setData(x);
			
			temp=temp.getPrev();
		}
		
	}
	
	public void display()
	{
		if(isEmpty())
		{
			System.err.println("List is empty!! ");
			return;
		}
		Node temp = start;
		
		while(temp!=null)
		{
			System.out.println(temp.getData());
			temp=temp.getNext();
		}
	}
}
