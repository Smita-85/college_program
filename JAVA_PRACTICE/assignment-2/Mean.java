//Mean of given numbers
class Mean
{
 public static void main(String args[])
 {
   int arr[]={30,36,47,50,52,52,56,60,63,70,70,110};
   int sum=0;
   for(int i=0;i<=11;i++)
   {
   sum=sum+arr[i];
   }
  int mean=sum/12;
  System.out.print("mean value is:"+mean);
  }
 }