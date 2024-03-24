//sorting of an array
import java.util.*;
class Sorting
{
 public static void main(String args[])
 {
  int temp,i,j;
  Scanner sc=new Scanner(System.in);
  int arr[]=new int[5];
  System.out.println("enter the elements:");
  for(i=0;i<5;i++)
  {
   arr[i]=sc.nextInt();
  }
  for(i=0;i<5;i++)
  {
   for(j=i;j<4;j++)
   {
    temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
   }
  }
  System.out.println("sorted array:");
  for(i=0;i<5;i++)
  {
  System.out.print(arr[i]+"\t");
  }
 }
}
  