package divya.jpro.pratice;

public interface BankPro 
{
public void withdraw();
public void deposite();

public static void main(String[] args) 	
{
BankPro q;
q = new Icici();
q.deposite();
q.withdraw();

q = new Hdfc();
q.deposite();
q.withdraw();
}


}
