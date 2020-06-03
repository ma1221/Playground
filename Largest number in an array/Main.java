import java.util.Scanner;
class Main{
    public static void main(String args[]){
    
      Scanner in=new Scanner(System.in);
    int size=in.nextInt();
    int arr[]=new int[size];
    int temp;
    for (int i=0;i<=size-1;i++)
    {
      arr[i]=in.nextInt();
    }
    temp=arr[0];
    for (int i=1;i<=size-1;i++)
    {
      
      if (arr[i]>temp)
         temp=arr[i];
    }
     System.out.print(temp);
    }
}