//ASSIGNMENT-6
//QUESTION-4

abstract class GeometricFigure
{
  abstract void getarea();
  double dim1,dim2;
}
class Triangle extends GeometricFigure
{
	Triangle(double dim1,double dim2)
  {
  this.dim1=dim1;
  this.dim2=dim2;
  }
  //@override
  void getarea()
  {
     double tarea=0.5*dim1*dim2;
	 System.out.println("Area of triangle:"+tarea);
  }
}

class Rectangle extends GeometricFigure
{
	Rectangle(double dim1,double dim2)
  {
  this.dim1=dim1;
  this.dim2=dim2;
  }
  //@override
  void getarea()
  {
  double rarea=dim1*dim2;
  System.out.println("Area of Rectangle:"+rarea);
  }
}
class Question4_6
{
public static void main(String args[])
{
 GeometricFigure s1=new Triangle(2.0,3.0);
 s1.getarea();
 GeometricFigure s2=new Rectangle(5.0,4.0);
 s2.getarea();
}
}

 