import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	 Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int k=6;
     
        for(int i=0;i<n;i++)
        {
         int a=(k+(5*i));
            System.out.print(a+" ");
          k=a;
        }
      }
}
        
        