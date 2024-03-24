//Adding all the elements of an array
import java.util.*;
class Matrix_add
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int n,sum=0;
  System.out.println("enter the size of array:");
  n=sc.nextInt();
  int x[]=new int[n];
  System.out.println("enter the elements of array:");
  for(int i=0;i<n;i++)
  {
   x[i]=sc.nextInt();
  }
 //Adiition of elements
 for(int i=0;i<n;i++)
 {
   sum=sum+x[i];
 }
 System.out.println("sum of all elements:"+sum);
 }
}

