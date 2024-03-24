//Factorial of a number
import java.util.*;
class Factorial
{
  void fact(int n)
 {
   int facto=1;
   for(int i=1;i<=n;i++)
   {
     facto=facto*i;
   }
   System.out.println("Factorial is:"+facto);
 }	
 public static void main(String args[])
  { 
   Scanner sc=new Scanner(System.in);
   int n;
   n=sc.nextInt();
   Factorial ei=new Factorial();
   ei.fact(n);
   }
 }
  
  
     