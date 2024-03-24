//Exception handling question-1
import java.util.*;
public class Excep_1
{
  public static void main(String args[])
  {
  int a,b;
  Scanner sc=new Scanner(System.in);
  a=sc.nextInt();
  b=sc.nextInt();
  if(a-b==0)
  {
    try
	{
	  throw new ArithmeticException("error");
	}
	catch(ArithmeticException e)
	{
	System.out.println("value of a-b is zero");
	}
  }
  else
  {
  int result=a/(a-b);
  System.out.println("Result:"+result);
  }
 }
}
  