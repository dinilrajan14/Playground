import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
        int a=11;
      for(int i=0;i<n;i++)
      {
      
        int b=a*a;
         System.out.print(b+" ");
        a=a+4;
      }
        
	}
}