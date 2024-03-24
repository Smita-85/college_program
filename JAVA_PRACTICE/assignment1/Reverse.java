//Reverse of a number
import java.util.*;
class Reverse
{
 public static void main(String args[])
 {
   int rev=0,n1,num;
   Scanner sc=new Scanner(System.in);
   num=sc.nextInt();
   while(num>0)
   {
    n1=num%10;
	rev=(rev*10)+n1;
	num=num/10;
   }
   System.out.println("Reverse of the given number is: "+rev);
  }
 }
   
   
 