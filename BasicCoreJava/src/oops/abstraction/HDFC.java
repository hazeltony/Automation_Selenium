package oops.abstraction;

public class HDFC implements RBI {

	@Override
	public void savingAccount() {
		System.out.println("HDFC Saving account");
		
	}

	@Override
	public void currentAccount() {
		System.out.println("HDFC Current account");
		
	}

	@Override
	public void debitCard() {
		System.out.println("HDFC Debit card");
		
	}

	@Override
	public void creditCard() {
		System.out.println("HDFC Credit card");
		
	}
	
	

}
