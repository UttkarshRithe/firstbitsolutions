package linkedlist.doublylinkedlist;

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
	
	public void insert(int ele,int pos)
	{
		if(pos<=0 || pos>count+1)
		{
			System.out.println("You Enter Wrong Position and May be you enter position which is greater than count!!");
			return;
		}
		
		Node newNode = new Node(ele);
		if(pos==1)
		{
			if(!isEmpty())
			{
				newNode.setNext(start);
				start.setPrev(newNode);
			}
			start =newNode;
			this.count++;
			return;
		}
		
		Node temp = start;
		int count=1;
		
		while(count<pos && temp.getNext()!=null)
		{
			temp = temp.getNext();
			count++;
		}
		
		if(count==pos-1)
		{
			temp.setNext(newNode);
			newNode.setPrev(temp);
			this.count++;
			return;
		}
		else
		{
			newNode.setNext(temp);
			newNode.setPrev(temp.getPrev());
			
			temp.getPrev().setNext(newNode);
			temp.setPrev(newNode);
		}
		
	}
	
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("List is Empty!!");
			return;
		}
		
		Node temp = start;
		while(temp!=null)
		{
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
		
		
	}
	
	
	
}
