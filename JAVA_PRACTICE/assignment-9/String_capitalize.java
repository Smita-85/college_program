//Question-4
import java.util.*;
class String_capitalize
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  String str=sc.nextLine();
  String s[]=str.split(" ");
  for(int i=0;i<s.length;i++)
  {
  s[i]=s[i].substring(0,1).toUpperCase()+s[i].substring(1);
  }
  for(int i=0;i<s.length;i++)
  {
  System.out.print(s[i]+" ");
  }
 }
}