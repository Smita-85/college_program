//Grade of a student using Switch case
import java.util.*;
class Grade
{
 public static void main(String args[])
  {
   int mark1,mark2,mark3;
   Scanner sc=new Scanner(System.in);
   System.out.print("enter three subject marks:");
   mark1=sc.nextInt();
   mark2=sc.nextInt();
   mark3=sc.nextInt();
   int sum=(mark1+mark2+mark3)/300*100;
   switch(sum/10)
   {
    case 9:System.out.print("Grade-o");
	       break;
    case 8:System.out.print("Grade-E");
           break;
	case 7:System.out.print("Grade-A");
           break;
    case 6:System.out.print("Grade-D");
           break;
    case 5:System.out.print("Grade-B");
           break;
    case 4:System.out.println("Grade-C");
           break;
    default:System.out.println("FAIL");
           
    }
  }
}  