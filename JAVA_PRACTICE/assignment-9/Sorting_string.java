//Question-1
import java.util.*;
class Sorting_string
{
public static void main(String args[])
{
	String temp;
 Scanner sc=new Scanner(System.in);
 String[] str={"ram","Anand","Ajay","John","Haris"};
 for (int i = 0; i < str.length-1; i++) 
        {
            for (int j = i + 1; j < str.length-1; j++) 
            {
                if (str[i].compareTo(str[j])>0) 
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
 System.out.println("Sorted order:");
 for(int i=0;i< str.length-1;i++)
 {
   System.out.println(str[i]);
 }
 }
}