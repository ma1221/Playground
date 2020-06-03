import java.util.Scanner;
class Main
{
  public static int square(int n)
  {
    int p=n*n;
    return p;
  }
  public static void main (String[] args)
    {
	 Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     int sn=square(n);
     System.out.print(sn);
	} 
}