import java.util.Scanner;
class Main{
	public static void main (String[] args){
	Scanner in=new Scanner(System.in);
    int n=in.nextInt();
     int p=in.nextInt();          
    System.out.print(exponent(n,p));
    }

    public static int exponent(int num1,int num2)
    {
     int pow=1;
     for (int i=1;i<=num2;i++)
     {
       pow=pow*num1;
     }
     return pow;
    }
}



