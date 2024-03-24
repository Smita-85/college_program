//Armstrong number
import java.util.*;
class Armstrong
{
 public static void main(String args[])
 {
   int sum=0,rem,num,x,ref;
   Scanner sc=new Scanner(System.in);
   System.out.print("enter the number:");
   num=sc.nextInt();
   ref=num;
   while(num>0)
   {
    x=num%10;
	sum=sum+(x*x*x);
	num=num/10;
   }
   if(ref==sum)
   {
    System.out.print("Armstrong number");
   }
   else
   {
   System.out.print("Not a Armstrong number");
   }
  }
 }
   