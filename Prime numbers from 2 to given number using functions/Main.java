import java.util.Scanner;
class Main{
	public static void main (String[] args){
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    for (int i=2;i<=n;i++)
    {
      if (is_prime(i)==1)
      {
        System.out.println(i);
      }
    }
	}

    public static int is_prime(int p)
    {
     int prime=1;
     for (int k=2;k<=p/2;k++)
     {
      if (p%k==0)
      {
        prime=0;
        break;
      }
     }
    return prime;
    }
	}
