import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      
       int b=(n/10)%10;
    if(n<9)
    {
      System.out.print("Not a Trendy Number");
    }
        
     else if(b%3==0)
         {
            System.out.print("Trendy Number");
         }
      else
    System.out.print("Not a Trendy Number");
    }
}