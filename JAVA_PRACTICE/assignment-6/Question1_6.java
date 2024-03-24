//ASSIGNMENT=6 
//QUESTION-1

interface Calculator
{
  
abstract public void add(int a,int b);
abstract public void sub(int a,int b);
abstract public void mul(int a,int b);
abstract public void div(int a,int b);
}
class Democalculator implements Calculator
{
	
 public void add(int a,int b)
 {
 System.out.println("addition of two numbers:"+(a+b));
 }
 public void sub(int a,int b)
 {
 System.out.println("substraction of two numbers:"+(a-b));
 }
 public void mul(int a,int b)
 {
 System.out.println("multiplication of two numbers:"+(a*b));
 }
 public void div(int a,int b)
 {
 System.out.println("division of two numbers:"+(a/b));
 }
}
class Question1_6
{
  public static void main(String args[])
  {
	  
    Democalculator d1=new Democalculator();
	d1.add(5,3);
	d1.sub(8,4);
	d1.mul(2,2);
	d1.div(16,8);
	}
}
   
