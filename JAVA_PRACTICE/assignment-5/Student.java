//class and method example
class Student
{
int roll,p1,p2,p3;
String name;
 void get_info( int r1,int m1,int m2,int m3,String n1)
 {
   roll=r1;
   name=n1;
   p1=m1;
   p2=m2;
   p3=m3;
 }
 void calculate()
 {
 int avg=(p1+p2+p3)/3;
 int grade=avg/10;
 switch(grade)
 {
   case 10:
   case 9:
      System.out.print("O-grade");
	  break;
   case 8:
      System.out.print("E-grade");
	  break;
   case 7:
      System.out.print("A-grade");
	  break;
   case 6:
      System.out.print("B-grade");
	  break;
   default:
     System.out.print("FAIL"); 
     break;
 }
}
 void show_details()
{
  System.out.println(" "+roll+" "+name);
}
public static void main(String args[])
{
  Student s1=new Student();
    s1.get_info(1,80,80,80,"smita");
	s1.calculate();
	s1.show_details();
  Student s2=new Student();
    s2.get_info(2,90,90,90,"sish");
	s2.calculate();
	s2.show_details();
  Student s3=new Student();
  s3.get_info(3,70,70,70,"sriman");
  s3.calculate();
  s3.show_details();
 }
}
  
	
	
