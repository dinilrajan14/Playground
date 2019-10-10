import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      double a=0.5;
           System.out.print(a+" "); 
      for(int i=1;i<n;i++)
      {
        double b=a*3;
     
          System.out.print(b+" "); 
      a=b;
     
      }
	}
}