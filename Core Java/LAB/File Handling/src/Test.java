
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
	int roolno;
	String name;
	
	Student(int roolno, String name) {
		this.roolno = roolno;
		this.name = name;
	}

	@Override
	public String toString() {
		return "student [roolno=" + roolno + ", name=" + name + "]";
	}
}

public class Test {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("file.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(dos);
			
			oos.writeObject(new Student(101,"Yash"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
