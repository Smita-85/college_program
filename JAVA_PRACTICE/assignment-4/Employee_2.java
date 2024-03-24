
import java.util.*;
class Person
{
 String name;
 int age;
Person(int age,String name)
{
 this.age=age;
 this.name=name;
}
}
class Employee_2 extends Person
{
int emp_no;
double basic_sal;
double da,hra,gross_sal;
Employee_2(int emp_no,double basic_sal,int age,String name)
{ 
  super(age,name);
  this.emp_no=emp_no;
  this.basic_sal=basic_sal;
  
}
void calculate()
{
da=0.2*basic_sal;
hra=0.3*basic_sal;
gross_sal=da+hra+basic_sal;
}
void show()
{
 System.out.println(name+" "+age+" "+basic_sal+" "+gross_sal);
}
public static void main(String args[])
{
  Employee_2 e1[]=new Employee_2[2];
  e1[0]=new Employee_2(36,20000.00,25,"smita");
  e1[0].calculate();
  e1[0].show();
  e1[1]=new Employee_2(27,30000.00,27,"sish");
  e1[1].calculate();
  e1[1].show();
}
}
