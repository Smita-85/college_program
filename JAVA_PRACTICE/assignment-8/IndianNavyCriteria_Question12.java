import java.util.*;
class TooOldException extends Exception
{
   TooOldException(String message)
   {
    super(message);
	}
}
class TooYoungException extends Exception
{
  TooYoungException(String message)
  {
   super(message);
   }
}
class IndianNavyCriteria_Question12
{
  int age;
  public IndianNavyCriteria(int age)
  {
   this.age=age;
   }
   public void checkage() throws TooOldException,TooYoungException
   {
    if(age>28)
	{
	 throw new TooOldException("Sorry you are Too old for Indian navy job");
	 }
	 if(age<18)
	 {
	 throw new TooYoungException("Sorry you are Too young for Indian navy job");
	 }
	 else
	 {
	 System.out.println("Congratulations!you are eligible for Indian navy job");
	 }
	 public class Test11
	 {
	  public static void main(String args[])
	  {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter candidates age:");
	   int age=sc.nextInt();
	   IndianNavyCriteria india=new IndianNavyCriteria(age);
	   try
	   {
	    india.checkage();
	   }
	   catch(TooOldException e)
	   {
	    System.out.println("Error"+e.getMessage());
        }
      catch(TooYoungException e)
      {
       System.out.println("Error"+e.getMessage());
      }
    }
  }
	    