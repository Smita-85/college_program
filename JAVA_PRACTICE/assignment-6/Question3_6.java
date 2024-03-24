//ASSIGNMENT-6
//QUESTION-3

 abstract class Shape
{
  abstract void computearea();
  double dim1,dim2;
}
class Triangle extends Shape
{
	Triangle(double dim1,double dim2)
  {
  this.dim1=dim1;
  this.dim2=dim2;
  }
  //@override
  void computearea()
  {
     double tarea=0.5*dim1*dim2;
	 System.out.println("Area of triangle:"+tarea);
  }
}

class Rectangle extends Shape
{
	Rectangle(double dim1,double dim2)
  {
  this.dim1=dim1;
  this.dim2=dim2;
  }
  //@override
  void computearea()
  {
  double rarea=dim1*dim2;
  System.out.println("Area of Rectangle:"+rarea);
  }
}
class Question3_6
{
public static void main(String args[])
{
 Shape s1=new Triangle(2.0,3.0);
 s1.computearea();
 Shape s2=new Rectangle(3.0,4.0);
 s2.computearea();
}
}

 