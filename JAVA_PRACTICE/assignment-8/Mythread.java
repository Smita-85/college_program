class Mythread extends Thread
{
public void run()
{
System.out.println("thread is running");
}
public static void main(String args[])
{
  Mythread t1=new Mythread();
  Mythread t2=new Mythread();
  t1.start();
  t2.start();
 }
}
  