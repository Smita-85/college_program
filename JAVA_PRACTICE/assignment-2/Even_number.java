//Finding even numbers 
import java.util.*;
class Even_number
{
  public static void main(String args[])
  {
    int m,n,even=0,odd=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the values of m and n:");
	m=sc.nextInt();
	n=sc.nextInt();
	for(int i=m;i<=n;i++)
	{
	 if(i%2==0)
	 {
	   even++;
	 }
	 else
	 {
		odd++;
	 }
	}
	System.out.println("Even numbers:"+even);
	System.out.println("Odd numbers:"+odd);
   }
 }