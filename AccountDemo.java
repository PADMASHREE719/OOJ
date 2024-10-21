import java.util.*;
class Account{
	string customer_name , account_number , type_of_account;
	float deposit;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the current balance");
	float balance=sc.nextFloat();
	float min_amt=500.0;
	System.out.println("Enter the service charge);
	float service_charge=sc.nextFloat();
	System.out.println("enter the amount needs to be deposited");
	float amt=sc.nextFloat();
	System.out.println("enter the amount needs to be withdraw");
	float w_amt=sc.nextFloat();
	System.out.println("enter the principle amount");
	float p=sc.nextFloat();
	System.out.println("enter the interest rate");
	float r=sc.nextFloat();
	System.out.println("balance is:"+" "+balance);
	float ci=sc.nextFloat();
}
class  Cur-acct extends Account{
	void balance_amt()
	{
		if(balance<min_amt)
		{
			balance=balance - service_charge;
		}
		System.out.println("balance amt is"+" "+balance);
		System.out.println("check book facilities are available");	
	}
class  Sav-acct extends Account{
	void balance()
	{
		balance=balance+amt;
		System.out.println("balance amt is"+" "+balance);
	}
	void compoundInterest()
	{
		ci=(p*(1+(r/365)))**(365*t);
		System.out.println("Compount interest"+" "+ci);
	}
}
class AccountDemo
{
	public static void main(String args[])
	{
		Account ob = new Account();
	}
}
