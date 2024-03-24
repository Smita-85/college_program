//Matrix multiplication
import java.util.*;
class Matrix_product
{
public static void main(String args[])
{
 int mat1[][]=new int[2][2];
 int mat2[][]=new int[2][2];
 int mat3[][]=new int[2][2];
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the elements of first matrix:");
 for(int i=0;i<2;i++)
 {
  for(int j=0;j<2;j++)
  {
  mat1[i][j]=sc.nextInt();
  }
 }
 System.out.println("enter the elements for second matrix:");
 for(int i=0;i<2;i++)
 {
  for(int j=0;j<2;j++)
  {
   mat2[i][j]=sc.nextInt();
  }
 }
 //matrix multiplication
 for(int i=0;i<2;i++)
 {
  for(int j=0;j<2;j++)
  {
    mat3[i][j]=0;
	for(int k=0;k<2;k++)
	{
	mat3[i][j]=mat3[i][j]+(mat1[i][k]*mat2[k][j]);
   }
 }
 }
 //display of product matrix
 for(int i=0;i<2;i++)
 {
  for(int j=0;j<2;j++)
  {
  System.out.print(mat3[i][j]+" ");
  }
  System.out.println();
 }
 }
}
