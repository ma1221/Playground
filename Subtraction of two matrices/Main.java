import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner in=new Scanner(System.in);
    int row=in.nextInt();
    int column=in.nextInt();
    int matrix1[][]=new int[row][column];
    for (int i=0;i<row;i++)
    {
      for(int j=0;j<column;j++)
      {
        matrix1[i][j]=in.nextInt();
      }
    }
    int matrix2[][]=new int[row][column];
    for (int i=0;i<row;i++)
    {
      for(int j=0;j<column;j++)
      {
        matrix2[i][j]=in.nextInt();
      }
    }
    int subtract[][]=new int[row][column];
    for (int i=0;i<row;i++)
    {
      for (int j=0;j<column;j++)
      {
        subtract[i][j]=matrix1[i][j]-matrix2[i][j];
        System.out.print(subtract[i][j]+" ");
      }
      System.out.println();
    }
  }
}
  