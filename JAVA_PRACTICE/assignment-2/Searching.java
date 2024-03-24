//SEARCHING OF A ELEMENT IN AN ARRAY
import java.util.*;
class Searching
{
public static void main(String args[])
{
  int size,num,flag=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the size of array:");
  size=sc.nextInt();
  int arr[]=new int[size];
  System.out.println("enter the array elements:");
  for(int i=0;i<size;i++)
  {
  arr[i]=sc.nextInt();
  }
  System.out.println("enter the element you want to search:");
  num=sc.nextInt();
  for(int i=0;i<size;i++)
  {
     if(arr[i]==num)
	 {
	  flag++;
	 }
  }
  if(flag>0)
  {
  System.out.println("given element is present");
  }
  else
  {
  System.out.println("given element is not present");
  }
 }
}
  
  