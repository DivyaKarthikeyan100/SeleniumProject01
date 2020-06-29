package divya.jpro2.practice;

import divya.jpro.pratice.Apple;

public class Grapes extends Apple
{
	public void m3()
	{
	System.out.println("I am from method m3");	
	}

	public static void main(String[] args)
	{
		Grapes g = new Grapes();
		g.m3();
		g.m1();
		
		

	}

}
