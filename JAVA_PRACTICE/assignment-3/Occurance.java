//occurance of elements
import java.util.*;
class Occurance
{
 public static void main(String args[])
 {
  int count=0,num;
  Scanner sc=new Scanner(System.in);
  int arr[]=new int[5];
  System.out.println("enter the elements:");
  for(int i=0;i<5;i++)
  {
    arr[i]=sc.nextInt();
  }
  System.out.println("enter the number:");
  num=sc.nextInt();
  for(int i=0;i<5;i++)
  {
   if(arr[i]==num)
   {
    count++;
   }
  }
  System.out.println("occurance of given number:"+count);
  }
 }
   