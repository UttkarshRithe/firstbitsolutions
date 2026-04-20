
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

	public static void main(String[] args)
	{
		
		
		
	}
	
	
	public static void main1(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("file");
			DataOutputStream dos = new DataOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(dos);
			
			oos.writeObject(new Student(101,"Yash"));
			System.out.println("successfully written!!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
