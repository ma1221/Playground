import java.util.Scanner;
class Main{
  public static void main(String args[]) {
  Scanner scan = new Scanner(System.in);
    String str1 = scan.nextLine();
    String str2 = scan.nextLine();
    int str1_len = str1.length();
    int str2_len = str2.length();
    int count=0;
    for (int i=0;i<str1_len-1;i++)
    {boolean matching=true;
      for (int j=0;j<str2_len-1;j++)
      {
        if (str1.charAt(i+j)!=str2.charAt(j))
           matching=false;
      }if (matching)
       count++;
    }
    System.out.print(count);
  }
  } 
