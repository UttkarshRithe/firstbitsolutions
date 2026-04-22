package generalizeLinkedlist;

public class Student implements Comparable<Student> {

    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() { return name; }
    public int getMarks() { return marks; }

    // Marks ke basis pe sort hoga (ascending)
    @Override
    public int compareTo(Student other) {
        return this.marks - other.marks;
    }

    // deleteElement() mein .equals() use hota hai
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        return this.name.equals(other.name) && this.marks == other.marks;
    }

    // Display ke liye
    @Override
    public String toString() {
        return "[ Name: " + name + " | Marks: " + marks + " ]";
    }
}
