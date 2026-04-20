class Animal {
    String eat() {
       return "Animal eating";
    }
}

interface Vehicle {
    void move();
}

interface Toy {
    void play();
}

class Horse extends Animal implements Vehicle, Toy {

    public void move() {
        System.out.println("Horse used as vehicle");
    }

    public void play() {
        System.out.println("Horse used as toy");
    }
}

class TestAnimal{
	public static void main(String[] args)
	{
		Animal a1=new Horse();
		System.out.println(a1.eat());
		
		
	}
}