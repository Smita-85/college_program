//Question-2

class Thread1 extends Thread
{
  int num;
  int square;
  Thread1(int num)
  {
  this.num=num;
  }
  public void run()
  {
	  square=num*num;
  System.out.println("square of given number:"+square);
  }
}
class Thread2 extends Thread
{
	int n;
   Thread2(int num1)
   {
	   n=num1;
   }
   public void run()
   {
  int sum=0,rev=0;
  while(n>0)
  {
    rev=n%10;
	sum=sum+rev;
	n=n/10;
  }
  System.out.println("sum of digits:"+sum);
   }
}
class Test
{
 public static void main(String args[])
 {
   Thread1 t1=new Thread1(5);
     t1.start();
   Thread2 t2=new Thread2(t1.square);
	 try{
		 t1.join();
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
	 t2.start();
 }
}
   
    
  
  
  