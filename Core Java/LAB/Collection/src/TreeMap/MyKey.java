package TreeMap;

public class MyKey implements Comparable<Employee> {
	int key;

	MyKey(int key) {
		this.key = key;
	}

	@Override
	public int compareTo(Employee e) {
		
		return this.key-e.id;
	}
	
}
