//sum of the Square of Natural numbers
import java.util.*;
class Square_sum
{
 public static void main(String args[])
  {
    int n,i,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of n:");
	n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
	 sum=sum+(i*i);
	}
	System.out.println("sum value is:"+sum);
  }
 }
	
