package JavaTestTasks;

import java.util.Scanner;

 class Customer 
{
	private String firstname;
	private String lastname;
	public Customer()
	{
		
	}
	public Customer(String firstname, String lastname) 
	{
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public String getFirstname()
	{
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	@Override
	public String toString() {
		return "customer [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	
	}

 class Account extends Customer
{
	 private double balance;
		private int accountnum;
		private float interestrate;
		public Account()
		{
			
		}
		public Account(double balance, int accountnum, float interestrate) 
		{
			super();
			this.balance = balance;
			this.accountnum = accountnum;
			this.interestrate = interestrate;
		}
		public double getBalance() 
		{
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public int getAccountnum() {
			return accountnum;
		}
		public void setAccountnum(int accountnum) {
			this.accountnum = accountnum;
		}
		public float getInterestrate() {
			return interestrate;
		}
		public void setInterestrate(float interestrate) {
			this.interestrate = interestrate;
		}
		public void deposit(double amount)
		{
			double updatedamount=this.balance+amount;
			System.out.println("update amount in your account is: "+updatedamount);
		}
		public void withdraw(double amount)
		{
			if(amount<this.balance)
			{
				double remainingamount=this.balance-amount;
				System.out.println("update amount in your account :"+remainingamount);
			}
			else
			{
				System.out.println("no sufficient funds in your account");
			}
			
		}
		@Override
		public String toString() {
			return "Account [balance=" + balance + ", accountnum=" + accountnum + ", interestrate=" + interestrate + "]";
		}
		
		
}
 class Tester
 {
	 public static void main(String[] args)
	 {
			Customer customer=new Customer();
			Account account=new Account();
			account.setAccountnum(123456);
			account.setBalance(1000);
			account.setInterestrate(2.5f);
			customer.setFirstname("sumanth");
			customer.setLastname("naidu");
			System.out.println("hai "+customer.getFirstname()+" "+customer.getLastname());
			Scanner scanner=new Scanner(System.in);
			System.out.println("choose deposit or withdraw");
			String str=scanner.next();
			if(str.equals("deposit"))
			{
				System.out.println("enter deposited amount");
				double d=scanner.nextDouble();
				account.deposit(d);
				System.out.println("thank you");
			}
			else
			{
				System.out.println("enter withdraw ammount");
				double w=scanner.nextDouble();
				account.withdraw(w);
				System.out.println("thanks");
			}
		}
 }

 

	
	



