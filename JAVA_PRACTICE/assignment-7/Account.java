//Exception handling Question-2
public class Account
{
 String name;
 int acc_no;
 double balance;
 Account(String n,int ac,double bal)
 {
 name=n;
 acc_no=ac;
 balance=bal;
 }
 public void deposit(int amount)
 {
 balance=balance+amount;
 }
 public void withdraw(int amt)
 {
 balance=balance-amt;
 }
 public void display()
 {
 System.out.println("Available balance:"+balance);
 }
 public void transfer(Account acc1,Account acc2,int amt)
 {
   if(acc1.balance<500) throws MinimumBalanceException
   {
	finally
	{
	System.out.println("Always executed");
	}
   }
 else
 {
 acc1.balance=acc1.balance-amt;
 acc2.balance=acc2.balance+amt;
 }
}
}
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 Account acc1=new Account("smita",756432967,23000.00);
 acc1.deposit(2000);
 acc1.withdraw(1000);
 Account acc2=new Account("Sish",6780378923,50000.00);
 acc2.deposit(3000);
 acc2.withdraw(4000);
 try{
 acc2.transfer(acc1,acc2,20000);
 }
 catch(MinimumBalanceException e)
 {
 e.printstacktrace(e);
 }
}
 

 
  
	
	
 