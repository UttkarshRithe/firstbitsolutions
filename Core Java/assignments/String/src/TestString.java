
public class TestString {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello");
//		s2 ="hi";
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println(s2==s1);//memory address compare krta hai
		System.out.println(s3==s4);//		System.out.println(s1==s3);
//		
//		System.out.println(s1.equals(s3));//content compare krta hai
	}

}
