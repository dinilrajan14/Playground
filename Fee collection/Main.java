import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      String x=sc.nextLine();
       int t=sc.nextInt();
       int b=sc.nextInt();
      int h=sc.nextInt();
     switch(x)
     {
       case "MSDS":
         System.out.println(t+b);
         break;
       case  "MSH":
         System.out.println(t+h);
         break;
       case "MGSDS":
         System.out.printf("%.2f",(1.5*t)+b);
         break;
       case "MGSH":
         System.out.printf("%.2f",(1.5*t)+h);
         break;
     }
    }
}