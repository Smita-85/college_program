//inheritance example
class Grand_father
{
String First_name;
Grand_father(String f_name)
{
  First_name=f_name;
}
}
class Father extends Grand_father
{
String last_name;
  Father(String f_name,String l_name)
  {
   super(f_name);
  last_name=l_name;
  }
}
class Son extends Father
{
String son_name;
 Son(String f_name,String l_name,String s)
 {
 super(f_name,l_name);
 son_name=s;
 }
 void show()
 {
 System.out.println(First_name+" "+last_name+" "+son_name);
 }
}
class Inheritance_example
{
public static void main(String args[])
{ 
  Son s1=new Son("smita","rani","Raghav");
  s1.show();
 }
}
  
