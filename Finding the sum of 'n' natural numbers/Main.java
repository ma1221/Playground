
import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sum=sn(n);
      System.out.print(sum);
    }
    public static int sn(int p)
    {
      if (p!=0)
        return p+sn(p-1);
      else
        return p;
    }
    
}
        
// Type your code here
    