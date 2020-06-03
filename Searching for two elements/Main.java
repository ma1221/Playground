import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
    int size=in.nextInt();
   
    int arr[] = new int[size];
    int index1=-1;
    int index2=-1;
    for (int i=0;i<=size-1;i++)
    {
      arr[i]=in.nextInt();
    }
      
    int num1=in.nextInt();
    int num2=in.nextInt(); 
    for (int k=0;k<=size-1;k++)
    {
      if (arr[k]==num1)
         index1=k;
       if (arr[k]==num2)
          index2=k;        
    }
    System.out.println(index1);
    System.out.println(index2);
        
         
     
    
      
      
    }
}