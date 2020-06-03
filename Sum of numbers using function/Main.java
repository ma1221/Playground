import java.util.Scanner;
class Main{
  public static int sum_of_nums(int n)
  {
    int count=1;
    int sp=0;
    while(count<=n)
    {
      sp+=count;
      ++count;
    }
    return sp;
  }
  
  
  public static void main (String[] args){
	Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int sum=sum_of_nums(n);
	System.out.print(sum);
  
  
  
  
  }
}