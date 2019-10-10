import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
 
        Scanner sc= new Scanner(System.in);
      int a=sc.nextInt();
       int b=sc.nextInt();
      int e;
      for(int i=a;i<=b;i++)
      {
       
         int c=i%10;
         int d=i/10;
       e=((c+d)+(c*d));
        if(e==i)
        {
          System.out.println(i);
        }
      }
          
    }
}