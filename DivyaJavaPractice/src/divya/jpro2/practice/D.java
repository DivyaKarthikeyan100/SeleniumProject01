package divya.jpro2.practice;

public class D extends C
{
	// Hierarchical  Inheritance Test
	
	static D x;
	
	public void m4()
	{ 
		System.out.println(" I am from class D and Method m4()");
		}

	public static void main(String[] args)
	
	{
		x = new D(); 
		x.m1();
		x.m3();
		x.m4();
		
		

	}

}
