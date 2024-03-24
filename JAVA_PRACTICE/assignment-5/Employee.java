//class, object and constructor example
class Employee
{
  int emp_no;
  double basic_sal,gross_sal,da,hra;
  String emp_name;
  Employee(String n1,int e1,double b1)
  {
   emp_no=e1;
   basic_sal=b1;
   emp_name=n1;
  }
  void calculate()
  {
  hra=(0.1)*basic_sal;
  da=(0.2)*basic_sal;
  gross_sal=basic_sal+da+hra;
  }
  void show_details()
  {
  System.out.print(emp_name+"\t "+emp_no+"\t"+basic_sal+"\t "+gross_sal);
  }
 public static void main(String args[])
 {
    Employee e1=new Employee("smita",234 ,25000.0 );
	e1.calculate();
	System.out.println("emp_name"+" "+"emp_no"+" "+"basic_sal"+" "+"gross_sal");
	e1.show_details();
	System.out.print("\n");
	Employee e2=new Employee("sish",235 ,30000.0);
	e2.calculate();
	e2.show_details();
  }
}
	
 