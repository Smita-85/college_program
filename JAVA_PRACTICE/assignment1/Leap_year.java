import java.util.*;
class Leap_year
{
 public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int a;
   System.out.println("enter the year:");
   a=sc.nextInt();
   if((a%4==0) && (a%100!=0))||(a%400==0))
   {
    System.out.println("leap year");
   }
   else
   {
   System.out.println("Not a leap year");
   }
  }
 }
   