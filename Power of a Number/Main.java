import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      int a,b,p=1;
      a=sc.nextInt();
      b=sc.nextInt();
     while(b!=0)
     {
       p=p*a;
       --b;
     } 
      System.out.println(p);
 }
      
}