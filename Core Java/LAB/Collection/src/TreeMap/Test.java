package TreeMap;

import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		TreeMap<MyKey, Employee> tm1 = new TreeMap<MyKey,Employee>();
		tm1.put(new MyKey(1), new Employee(1,"Raj", 14500));
		tm1.put(new MyKey(5), new Employee(5,"Pranav", 25500));
		tm1.put(new MyKey(2), new Employee(2,"Tejas", 18500));
		tm1.put(new MyKey(3), new Employee(3,"Om", 45500));
		
		System.out.println(tm1);
		
	}
}
