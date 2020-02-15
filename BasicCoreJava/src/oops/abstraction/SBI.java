package oops.abstraction;

public class SBI implements RBI {

	@Override
	public void savingAccount() {
		System.out.println("SBI Savings account");
		
	}

	@Override
	public void currentAccount() {
		System.out.println("SBI Current account");
		
	}

	@Override
	public void debitCard() {
		System.out.println("SBI Debit card");
		
	}

	@Override
	public void creditCard() {
		System.out.println("SBI Credit card");
		
	}

}
