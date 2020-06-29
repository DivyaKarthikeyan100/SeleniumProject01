package divya.jpro.pratice;

public class Hdfc implements BankPro {

	public static void main(String[] args) {
		Hdfc j =new Hdfc();
		j.withdraw();
		j.deposite();

	}

	@Override
	public void withdraw() {
		System.out.println("withdraw from HDFC");
		
	}

	@Override
	public void deposite() {
		System.out.println("Deposite from HDFC");
		
	}

}
