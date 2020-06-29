package divya.jpro.pratice;

public class AddSubPrint
{
int a=50, b=20, c;

public void add()
{
	c=a+b;
	System.out.println("Addition" + c);
	}
public void sub()
{
	c=a-b;
	System.out.println("Subtraction" + c);
}

public static void main(String[] args) 
{
	AddSubPrint obj = new AddSubPrint();
			obj.add();
	obj.sub();
	
}
}