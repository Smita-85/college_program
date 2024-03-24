//Addition of two matrices
import java.util.*;
class Adding
{
 public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int mat1[][]=new int[2][2];
   int mat2[][]=new int[2][2];
   int res[][]=new int[2][2];
   System.out.println("enter the elements of first matrix:");
   for(int i=0;i<mat1.length;i++)
   {
     for(int j=0;j<mat1.length;j++)
	 {
	  mat1[i][j]=sc.nextInt();
	 }
   }
   System.out.println("enter the elements of second matrix:");
   for(int i=0;i<mat2.length;i++)
   {
     for(int j=0;j<mat2.length;j++)
	 {
	  mat2[i][j]=sc.nextInt();
	 }
   }
  for(int i=0;i<2;i++ )
  {
   for(int j=0;j<2;j++)
    {
     res[i][j]=mat1[i][j]+mat2[i][j];
    }
  }
System.out.println("Resultant matrix:");
  for(int i=0;i<2;i++)
 {
  for(int j=0;j<2;j++)
   {
  System.out.print(res[i][j]+"\t");
   }
   System.out.print("\n");
  }
  }
 }
  
   