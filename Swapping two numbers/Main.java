import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
       int a,b,c;
      a=sc.nextInt();
      b=sc.nextInt();
      c=a;
      a=b;
      b=c;
      System.out.println(a);
      System.out.println(b);
    }
}