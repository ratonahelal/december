package CRM;

import LoansAndAdvances.CreditAccounts;

public class Customers {
	/*
	 * Create at least five void methods related to customers, for example,
	 * CreateCustomer(), DeleteCustomer()....
	 */

	public static void main(String[] args) {
		System.out.println("telentech");
	     CreateCustomer();
	     DeleteCustomer();
	     CreditAccounts.CreateCreditAccount();
	     CreditAccounts.CreateTransaction();
	}
// we can use protected
	public static void CreateCustomer() {
		System.out.println("customer created");
	}

	public static void DeleteCustomer() {
		System.out.println("customer Delated");
	}

}
