import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int e=0,o=0;
      while(n!=0)
      {
        int r=n%10;
        if(r%2==0)
        {
          e=e+r;
        }
        else
        {
          o=o+r;
        }
        n=n/10;
      }
        if(e==o)
        {
          System.out.println("yes");
        }
        else
        {
           System.out.println("No");
        }
      
          
    }
}