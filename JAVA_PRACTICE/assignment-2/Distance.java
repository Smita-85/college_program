//Distance between two points using distance formula
import java.util.*;
import java.lang.*;
class Distance
{
 public static void main(String args[])
  {
    double x1,x2,y1,y2,d1,d2,d,dist;
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the values of x1 and x2:");
	x1=sc.nextInt();
	x2=sc.nextInt();
	System.out.print("enter the values of y1 and y2:");
	y1=sc.nextInt();
	y2=sc.nextInt();
	d1=x2-x1;
	d2=y2-y1;
	d=((d1*d1)+ (d2*d2));
	dist=Math.sqrt(d);
	System.out.print("Distance value:"+dist);
  }
 }