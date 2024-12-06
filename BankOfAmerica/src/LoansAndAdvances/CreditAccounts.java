package LoansAndAdvances;

import CRM.Customers;

public class CreditAccounts 
{
   /*Create at least five void methods related to CreditAccounts,
	for example, CreateCreditAccount(), CreateTransaction().....*/
	
	public static void main(String[] args)
	{
		Customers.CreateCustomer();
		Customers.DeleteCustomer();
		CreateCreditAccount();
	     CreateTransaction();
	     CreateLoginAccount();
	     CreateLogoutAccount();
	}
	     
	     public static void CreateCreditAccount() 
	     {
	    	 System.out.println("CreateCreditAccount");
	     }
	     public static void CreateTransaction()
	     {
	    	 System.out.println("CreateTransaction");
	     }
	     protected static void CreateLoginAccount()
	     {
	    	 System.out.println("CreateLoginAccount");
	     }
	     
	     public static void CreateLogoutAccount()
	     {
	    	 System.out.println("CreateLogoutAccount");
	     }
	     
	     
}
