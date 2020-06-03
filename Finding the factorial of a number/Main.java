
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
   int n=in.nextInt();
   int fact=fn(n);
   System.out.print(fact);
  }
  public static int fn(int num)
  {
    if (num!=0)
    {
      return num*fn(num-1);
    }
    else 
      return 1; // your code here
  }
}