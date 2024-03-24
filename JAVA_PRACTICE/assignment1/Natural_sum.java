import java.util.*;
class Natural_sum
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int n,sum=0;
   System.out.println("enter the value of n:");
   n=sc.nextInt();
   for(int i=1;i<=n;i++)
   {
    sum=sum+i;
   }
   System.out.println("sum of natural numbers:"+sum);
   }
  }
   