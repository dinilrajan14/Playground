import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner sc= new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
 System.out.println("The profit obtained is Rs."+((a*b)-(a*c)-100));
	}
}