import java.util.*;
class Stack
{
 int top=-1,max=100;
 int arr[]=new int[max];
 int x;
void push()
{
 if(top==max-1)
 {
 System.out.println("overflow");
 }
 else
 {
 System.out.println("enter the elements:");
 Scanner sc=new Scanner(System.in);
  x=sc.nextInt();
 
 top=top+1;
arr[top]=x;
 }
} 

void pop()
{
if(top==-1)
{
 System.out.println("underflow");
}
else
{
	
System.out.println("popped element:"+arr[top]);
top=top-1;
} 
}

void show()
{
  if(top==-1)
 {
System.out.println("underflow");
 }
 else
 {
 System.out.println("Elements present are:");
 for(int i=top;i>=0;i--)
 {
  System.out.println(arr[i]+"\t");
 }
 }
}
public static void main(String args[])
{
  Stack s1=new Stack();
  for(int i=1;i<=5;i++)
  s1.push();
  s1.pop();
  s1.show();
}
}
 
 
 