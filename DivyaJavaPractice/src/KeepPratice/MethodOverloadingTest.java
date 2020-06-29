package KeepPratice;

public class MethodOverloadingTest 
{
	
	
	//same method name with different parameter type is called "method overloading".
	
	static int m1 (int x, int y)
	{
		
		return x+y;
	}
	
	static double m1 (double x, double y)
	{
		
		return x+y;
	}
	

	public static void main(String[] args) 
	{
		int obj = m1(5, 7);
		double obj1 = m1(10.2,23.5);
		
		System.out.println("Int method values " + obj);
		System.out.println("Double Method values" + obj1);

	}

}
