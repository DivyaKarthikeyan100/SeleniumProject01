package divya.jpro2.practice;

public class B extends A
{

	//Single inheritance Test
	
	public void m2()
	{
	System.out.println("I am from class B and Method m2()");
	}
	
	
	public static void main(String[] args) 
	
	{
		B b = new B();
		b.m2();
		b.m1();
		

	}

}
