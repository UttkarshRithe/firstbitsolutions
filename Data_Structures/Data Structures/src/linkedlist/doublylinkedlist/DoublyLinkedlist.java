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
	
	public void delete(int pos)
	{
		if(pos<=0||pos>this.count)
		{
			System.out.println("You enter negative position or pos in greater than count of ele!!");
			return;
		}
		
		if(isEmpty())
		{
			System.out.println("List is Empty!!");
			return;
		}
		if(pos==1)
		{
			start=start.getNext();
			if(start.getNext()!=null)
			{
				start.setPrev(null);
			}
			this.count--;
			return;
		}
		
		Node temp=start;
		int count=1;
		while(count<pos)
		{
			temp=temp.getNext();
			count++;
		}
		
		temp.getPrev().setNext(temp.getNext());
		if(temp.getNext()!=null)
		{
			temp.getNext().setPrev(temp.getPrev());
		}
		
		this.count--;
	}
	
	
	public void deleteByEle(int ele)
	{
		if(isEmpty()) {
			System.out.println("List is Empty!!");
			return;
		}
		
		Node temp=start;
		
		if(start.getData()==ele)
		{
			start = start.getNext();
			if(temp.getNext()!=null)
			{
				start.setPrev(null);
			}
			this.count--;
			return;
		}
		
		
		while(temp!=null)
		{
			if(temp.getData()==ele)
			{	
				
				temp.getPrev().setNext(temp.getNext());
				if(temp.getNext()!=null)
				{	
					temp.getNext().setPrev(temp.getPrev());
				}
				this.count--;
				return;
			}
			
			temp= temp.getNext();
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
