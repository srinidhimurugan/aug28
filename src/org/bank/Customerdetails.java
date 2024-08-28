package org.bank;

public class Customerdetails extends Class {

	@Override
	void Bankdetails() {
		System.out.println("branch: chennai");
		
	}

	@Override
	void accountdetails() {
	System.out.println("acc no:12345678");
		
	}
	void accountdetails1() {
	System.out.println("acc no:109876");
	
	}
	
	public static void main(String[] args) {
		Customerdetails n= new Customerdetails();
		n.accountdetails();
		n.accountdetails1();
		n.Bankdetails();
	}

}