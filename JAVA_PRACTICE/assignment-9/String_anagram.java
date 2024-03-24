//Question-5
import java.util.*;
class Solution {
    public void isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            System.out.println("two strings are not of equal size");
        }
        char str1[]=s.toCharArray();
        char str2[]=t.toCharArray();
         Arrays.sort(str1);
         Arrays.sort(str2);
        if(Arrays.equals(str1,str2))
        {
            System.out.println("Input strings are Anagram");
        }  
        else
		{
		System.out.println("Input strings are not Anagram");
		}
    }
}
class String_anagram
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 String st1=sc.nextLine();
 String st2=sc.nextLine();
 Solution s=new Solution();
 s.isAnagram(st1,st2);
}
}