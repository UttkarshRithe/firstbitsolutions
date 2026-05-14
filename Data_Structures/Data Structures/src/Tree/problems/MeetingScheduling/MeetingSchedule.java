package Tree.problems.MeetingScheduling;

public class MeetingSchedule {

		Node root;

	    public MeetingSchedule() {
	        root = null;
	    }
	    
	    
	    //inserting
	    public void insert(Meeting ele) 
	    { 
	    	root = insert(ele, root);
	    }
	    

	    private Node insert(Meeting ele, Node temp) {
	        if (temp == null) return new Node(ele);

	        if (ele.isOverlapping(temp.getData())) {
	            System.out.println("Overlap! Meeting cannot be inserted.");
	            return temp;
	        }
	        
	        if (ele.compareTo(temp.getData())<0)
	        	{
		            temp.setLeft(insert(ele, temp.getLeft()));
	        	}
	        else if(ele.compareTo(temp.getData())>0)
	        {
	            temp.setRight(insert(ele, temp.getRight()));
	        }
	        else
	        {
	        	System.out.println("Meeting already exists at this time!");
	        }
	        
	        return temp;
	    }
	    
	    
	    //displaying tree
	    public void inorder() {
	        System.out.print("Inorder: ");
	        inorder(root);
	        System.out.println();
	    }

	    private void inorder(Node temp) {
	        if (temp == null) return;
	        inorder(temp.getLeft());
	        System.out.print(temp.getData() + " ");
	        inorder(temp.getRight());
	    }
	        
}
