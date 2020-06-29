package divya.jpro.pratice;

public class Child extends FirstAbstract

{
	public static void main(String[] args)
	{
		Child c = new Child();
		c.a1();
		c.b1();

	}
	
	@Override
	public void b1() 
	{
		System.out.println("I am override from child class");
		
	}

}
