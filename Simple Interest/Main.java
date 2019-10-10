import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc= new Scanner(System.in);
      int n,a;
      float d,p;
      a=sc.nextInt();
      n=sc.nextInt();
      d=sc.nextFloat();
      p=(a*n*d)/100;
      System.out.println(p);
      
    }
}