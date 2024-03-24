//largest and smallest number in an array
import java.util.*;
class Largest_smallest
{
 public static void main(String args[])
 {
  int i,n,max,min;
  int arr[]={20,30,40,50};
  max=arr[0];
  min=arr[0];
  for(i=0;i<=3;i++)
  {
   if(arr[i]>max)
   {
    max=arr[i];
   }
   else if(arr[i]<min)
   {
    min=arr[i];
   }
  }
  System.out.print("largest:"+max);
  System.out.print("Smallest:"+min);
 }
}
  
  