package divya.jpro2.practice;

public class C extends B
{
	// Multilevel inheritance Test
	
	public void m3()
	{ 
		System.out.println(" I am from class C and Method m3()");
		}

	public static void main(String[] args) 
	{
		C c =new C();
		 c.m1();
		 c.m2();
		 c.m3(); 
	}

}
