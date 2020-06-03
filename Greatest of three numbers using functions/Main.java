import java.util.Scanner;
class Main{
	public static void main (String[] args){
		Scanner in=new Scanner(System.in);
    int n1=in.nextInt();
    int n2=in.nextInt();
    int n3=in.nextInt();
	System.out.print(great(n1,n2,n3));
    }
   public static int great(int x,int y,int z)
   {
     int temp;
     if (x>y)
        {
          if (x>z)
          {
            return x;
          }
          else 
          {
            return z;
          }
       }
       else 
       {
         if(y>z)
         {
          return y;
         }
         else 
          {
            return z;
          }
       }
   }
}
	