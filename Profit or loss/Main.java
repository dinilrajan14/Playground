import java.util.Scanner;
class Main
{
    public static void main(String args[])
    { Scanner sc= new Scanner(System.in);
      float a=sc.nextFloat();
       float b=sc.nextFloat();
       float s=a/12;
     if(b==s)
     {System.out.println("No profit nor loss");
    }
     else if(b>s)
     {
       System.out.println("Profit:Rs"+((b-s)*12));
     }
    else
       System.out.printf("Loss : Rs.%.2f",((s-b)*12));
    }
}