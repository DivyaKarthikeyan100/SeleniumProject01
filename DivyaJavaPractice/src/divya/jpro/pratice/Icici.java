package divya.jpro.pratice;

public class Icici implements BankPro

{

	public static void main(String[] args) {
		Icici i = new Icici();
		i.deposite();
		i.withdraw();

	}

	@Override
	public void withdraw() {
		System.out.println("withdraw from Icici");
		
	}

	@Override
	public void deposite() {
		System.out.println("deposite from Icici");
		
	}

}
