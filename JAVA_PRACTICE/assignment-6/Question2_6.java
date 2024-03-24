//ASSIGNMENT-1
//QUESTION-2

class Shape
{
  void draw()
  {
  System.out.println("Drawing shape");
  }
  void erase()
  {
  System.out.println("Erasing shape");
  }
}
class Circle extends Shape
{
  void draw()
  {
  System.out.println("Drawing circle");
  }
  void erase()
  {
  System.out.println("Erasing circle");
  }
}
class Triangle extends Shape
{
  void draw()
  {
  System.out.println("Drawing Triangle");
  }
  void erase()
  {
  System.out.println("Erasing Triangle");
  }
}
class Square extends Shape
{
 void draw()
 {
 System.out.println("Drawing Square");
 }
 void erase()
 {
 System.out.println("Erasing Square");
 }
}
class Question2_6
{
 public static void main(String args[])
 {
   Square s1=new Square();
   s1.draw();
   s1.erase();
   Triangle t1=new Triangle();
   t1.draw();
   t1.erase();
   Circle c1=new Circle();
   c1.draw();
   c1.erase();
   }
 }

 
 