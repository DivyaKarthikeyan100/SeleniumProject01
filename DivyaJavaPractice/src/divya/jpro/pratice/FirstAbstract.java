package divya.jpro.pratice;

public abstract class FirstAbstract 
{
	
	public void a1() 
	{
		
		System.out.println("a1 concerte method");
	}
	
	public abstract void b1();
	
	public static void main(String[] args)
	{
		FirstAbstract obj;
			
		obj = new Child();
		obj.a1();
		obj.b1();
		
		}
	}
