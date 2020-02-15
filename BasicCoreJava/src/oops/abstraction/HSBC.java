package oops.abstraction;

public class HSBC implements RBI{

	@Override
	public void savingAccount() {
		System.out.println("HSBC Saving account");
		
	}

	@Override
	public void currentAccount() {
		System.out.println("HSBC Current account");
		
	}

	@Override
	public void debitCard() {
		System.out.println("HSBC Debit card");
		
	}

	@Override
	public void creditCard() {
		System.out.println("HSBC credit card");
		
	}

}
