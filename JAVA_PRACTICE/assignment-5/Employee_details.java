import java.util.*;
class Employee
{
private String emp_name;
private String emp_no;
private int dependent_count;
Employee(String name,String ep_no,int dep_cnt)
{
  emp_name=name;
  emp_no=ep_no;
  dependent_count=dep_cnt;
}
void show()
{
System.out.println(emp_name+" "+emp_no);
}
int dep_count()
{
return dependent_count;
}
}
class Employee_details
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the size of array:");
 int n=sc.nextInt();
 String s1[]=new String[n];
 String ep[]=new String[n];
 int dep[]=new int[n];
 Employee e1[]=new Employee[n];
 for(int i=0;i<n;i++)
 {
	 s1[i]=sc.next();
	 ep[i]=sc.next();
	 dep[i]=sc.nextInt();
 }
 for(int i=0;i<n;i++)
 {
	 e1[i]=new Employee(s1[i],ep[i],dep[i]);
	 if(e1[i].dep_count()>2)
	 {
		 e1[i].show();
     }
 }
 }
}
 