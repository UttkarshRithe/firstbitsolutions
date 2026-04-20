package package_p1;

public class A {

		void myFunA()
		{
			System.out.println("Inside class A");
		}
		
		public static void main(String args[])
		{
			B b1 = new B();
			b1.myfunB();
		}
}

class B extends A
{
	A a1 = new A();
	void myfunB()
	{
		a1.myFunA();
	}
}

class C
{
	A a1 = new A();
	void myFunB()
	{
		a1.myFunA();
	}
}

