import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner (System.in);
    int a,b,p,s;
    a=sc.nextInt();
    b=sc.nextInt();
    p=2*(a+b);
    s=a*b;
    System.out.println(p+"m");
     System.out.println(s+"sqm");
  }
}