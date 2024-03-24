//Find the area of triangle,rectangle,circle by using method overloading.

class Triangle
{
  void area(double base,double height)
  {
    System.out.println("area of triangle is:"+0.5*base*height);
  }
  void area(int length,int breadth)
  {
  System.out.println("area of rectangle is:"+length*breadth);
  }
  void area(double radius)
  {
  System.out.println("area of circle is:"+3.14*radius*radius);
  }
 }
 class Test
 {
 public static void main(String args[])
 {
    Triangle t=new Triangle();
	t.area(3.00,5.00);
	t.area(6,2);
	t.area(4.34);
  }
}

