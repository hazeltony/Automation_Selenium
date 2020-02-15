package oops.abstraction;

import oops.inheritance.Mobile;
import oops.inheritance.Smartphone;
import oops.inheritance.Telephone;

public class BankUser {

	public static void main(String[] args) {
		
		/*int a=10;
		int b =20;
		sum(a,b);
		
		RBI obj= new HDFC(); datatype variable =value
		callBank(obj);*/
		
		sum(10,20);
		callBank(new HDFC());
		callBank(new HSBC());
		callBank(new SBI());
		
		callPhone(new Telephone());
		callPhone(new Smartphone());
		callPhone(new Mobile());
		
		}
	
	public static void callBank(RBI bank) {
		
		bank.creditCard(); //bank is the variable name of RBI which we used in the function and in main we directly passed the value new HDFC
		bank.debitCard();
		bank.savingAccount();
		bank.currentAccount();
		bank.demonetization();
}
	public static void callPhone(Telephone phone)
	{
		phone.calling();
	}
	
	public static void sum(int a, int b)
	{
		System.out.println(a+b);
	}
}
