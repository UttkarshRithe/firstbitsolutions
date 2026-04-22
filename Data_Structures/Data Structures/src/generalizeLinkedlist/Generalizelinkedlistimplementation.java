package generalizeLinkedlist;

public class Generalizelinkedlistimplementation {

    public static void main(String[] args) {

    	GeneralizeLinkedlist<Student> studentList = new GeneralizeLinkedlist<>();

        // Students insert karo
        studentList.insert(new Student("Rahul",  85));
        studentList.insert(new Student("Priya",  92));
        studentList.insert(new Student("Amit",   78));
        studentList.insert(new Student("Sneha",  95));
        studentList.insert(new Student("Rohan",  60));

        System.out.println("=== Original List ===");
        studentList.display();

        // Marks ke basis pe sort karo
        studentList.bubbleSort();

        System.out.println("=== Sorted by Marks (Ascending) ===");
        studentList.display();

        // Descending ke liye — compareTo ulta karo:
        // return other.marks - this.marks;
    }
}