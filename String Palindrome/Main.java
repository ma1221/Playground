import java.util.Scanner;
class Main{
    public static void main(String args[]) {
     Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    StringBuilder sb=new StringBuilder(str);
    int len=sb.length();
    int front=0;
    int end=len-1;
    String flag="Yes";
    while(front<end)
    {
      if (sb.charAt(front)!=sb.charAt(end))
      { 
        flag="No";
        break;
      }
      front++;
      end--;
    }
     System.out.print(flag);
    } 
}