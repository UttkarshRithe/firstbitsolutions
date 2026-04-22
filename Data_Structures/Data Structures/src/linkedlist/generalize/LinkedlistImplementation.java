package linkedlist.generalize;

public class LinkedlistImplementation {

	public static void main(String[] args) {

		
		Linkedlist<Student> l1 = new Linkedlist<>();
		
		Student s1 = new Student(1,"Yash",85);
		Student s2 = new Student(5,"Pritish",95);
		Student s3 = new Student(3,"Pranav",87);
		Student s4 = new Student(2,"Suryakant",89);
		Student s5 = new Student(4,"Ayush",75);
		
		l1.insert(s1);
		l1.insert(s2);
		l1.insert(s3);
		l1.insert(s4);
		l1.insert(s5);
		
		l1.display();
		
		
		l1.sort();
		
		l1.display();
		
		l1.deleteElement(s1);
		
		l1.display();
		
	
				
		
		
	}

}
