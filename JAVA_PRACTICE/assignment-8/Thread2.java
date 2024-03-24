//question-1
class Thread1 extends Thread
{
	int m,n;
	Thread1(int m,int n)
	{
		this.m=m;
		this.n=n;
	}
  public void run()
  {
    for(int i=m;i<=n;i++)
	{
	   if(i%2!=0)
	  System.out.println("child:"+i);
	}
	try
	{
		Thread.sleep(1000);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
  }
}
class Thread2 extends Thread
{
	int m,n;
	Thread2(int m,int n)
	{
		 this.m=m;
		 this.n=n;
	}
  public void run()
  {
     for(int i=m;i<=n;i++)
	 {
       if(i%2==0)
	   {
	     System.out.println("parent:"+i);
	    }
	  }
	  try
	  {
		  Thread.sleep(1000);
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
  }
 public static void main(String args[])
 {
   Thread1 c1=new Thread1(1,10);
   Thread2 p1=new Thread2(1,10);
   c1.start();
   p1.start();
  }
}