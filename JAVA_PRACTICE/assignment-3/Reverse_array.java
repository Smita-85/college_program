//Reverse of an Array
import java.util.*;
class Reverse_array
{
 public static void main(String args[])
  {
   int n,l;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter  the size of array:");
   n=sc.nextInt();
   int arr[]=new int[n];
   System.out.println("enter the elements:");
   for(int i=0;i<n;i++)
   {
    arr[i]=sc.nextInt();
   }
   int k=n-1;
   for(int i=0;i<n/2;i++)
   { 
    l=arr[i];
	arr[i]=arr[k];
	arr[k]=l;
	k=k-1;
	}
  System.out.println("reversed array:");
  for(int i=0;i<n;i++)
  {
    System.out.print(arr[i]+"\t");
  }
 }
}
	
    
	