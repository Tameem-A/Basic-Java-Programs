class Account
{
	public Account(String accno, String acctype, int amnt)
	{
		accountNo=accno;
		accounttype=acctype;
		amount=amnt;
		
	}
	
	String accountNo;
	String accounttype;
	int amount;
	
	public boolean withdrawamount(int amt)
	{
		if(amt>amount)
		{
			return false;
		}
		else
		{
			amount=amount-amt;
			return true;
		}
	}
	
	public boolean deposit(int amt)
	{
		if(amt<0)
		{
			return false;
		}
		else
		{
			amount=amount+amt;
			return true;
		}
	}
	
	
}
public class ClassObject2 {
	public static void main(String args[]) {
		Account obj1= new Account(null, null, 0);

		obj1.accountNo="SBI_34987060306";
		obj1.accounttype="SBA";
		obj1.amount=1000;
		
		System.out.println("AccountNumber: "+obj1.accountNo +"|"+ "AccountType: "+obj1.accounttype +"|"+ "Amount: " +obj1.amount);
		
		obj1.deposit(500);
		System.out.println("AccountNumber: "+obj1.accountNo +"|"+ "AccountType: "+obj1.accounttype +"|"+ "Amount: " +obj1.amount);

		
		obj1.withdrawamount(250);
		System.out.println("AccountNumber: "+obj1.accountNo +"|"+ "AccountType: "+obj1.accounttype +"|"+ "Amount: " +obj1.amount);
		
		Account obj2= new Account("SBI_34987060344","SBA",2000);
		System.out.println("AccountNumber: "+obj2.accountNo +"|"+ "AccountType: "+obj2.accounttype +"|"+ "Amount: " +obj2.amount);

	}
	

}
