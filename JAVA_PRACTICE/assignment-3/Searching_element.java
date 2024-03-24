//Searching of a particular element in an array
import java.util.*;
class Searching_element
{
public static void main(String args[])
{
  int flag=0;
  Scanner sc=new Scanner(System.in);
  int arr[]=new int[5];
  System.out.println("enter the array elements:");
  for(int i=0;i<5;i++)
  {
   arr[i]=sc.nextInt();
  }
  System.out.println("enter the element you want to search:");
  int x=sc.nextInt();
  for(int i=0;i<5;i++)
  {
   if(x==i)
   {
   flag++;
   }
  }
  if(flag>0)
  {
  System.out.println("Present");
  }
  else
  {
  System.out.println("Absent");
  }
 }
}
  