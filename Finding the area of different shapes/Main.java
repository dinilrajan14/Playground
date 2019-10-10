import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
       Scanner sc= new Scanner(System.in);
      int x=sc.nextInt();
      
     
     
      
      switch(x)
      {
        case 1:
          int s=sc.nextInt();
       System.out.print(s*s);
      break;
       case 2:
            int l=sc.nextInt();
       int b=sc.nextInt();
       System.out.print(l*b);
      break;
       case 3:
            int bs=sc.nextInt();
       int h=sc.nextInt();
       System.out.print((bs*h)/2);
      break;
       case 4:
           float r=sc.nextFloat();
       System.out.print(3.14*r*r);
      break;
    }
    }
}