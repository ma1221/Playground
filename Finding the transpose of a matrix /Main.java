import java.util.Scanner;
class Main{
  public static void main(String args[]){
   Scanner in=new Scanner(System.in);
   int row=in.nextInt();
   int column=in.nextInt();
   int matrix[][]=new int[row][column];
   for (int i=0;i<row;i++)
   {
     for(int j=0;j<column;j++)
     {
       matrix[i][j]=in.nextInt();
     }
   }
   int transpose[][]=new int[column][row];
   for (int i=0;i<row;i++)
   {
     for (int j=0;j<column;j++)
     {
       transpose[j][i]=matrix[i][j];
       System.out.print(transpose[j][i]+" ");
       
     }
       System.out.println();
   }
    
  }
}