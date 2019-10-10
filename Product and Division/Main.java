import java.util.Scanner;
class Main
{
    public static void main(String args[])
    { 
      Scanner sc=new Scanner(System.in);
      int a,b,c,d,e;
      a=sc.nextInt();
      b=sc.nextInt();
      c=a*b;
      d=a/b;
      e=a%b;
      System.out.println(c);
      System.out.println(d);
      System.out.println(e);
    }
}