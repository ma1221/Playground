import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
   int num=in.nextInt();
   int batch[]=new int[num];
   for (int i=0;i<=num-1;i++)
   {
     batch[i]=in.nextInt();
   }
   maxele(batch,num);
  }
  public static void maxele(int reg[],int size)
  {
    int temp=reg[0];
    int index=0;
    for (int i=1;i<=size-1;i++)
    {
      if (temp<reg[i])
      {
         temp=reg[i];
         index=i;
      }
    }
  System.out.print(index);
  }
}