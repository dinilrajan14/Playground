import java.util.Scanner;
class Main
{
    public static void main(String args[])
    { 
      Scanner sc=new Scanner (System.in);
      int n=sc.nextInt();
      int a=0,b=1,t;
      for(int i=2;i<n;i++)
      {
        t=b;
        b=a+b;
        a=t;
        //System.out.println(b);
      }
      System.out.println(b);
    }
}