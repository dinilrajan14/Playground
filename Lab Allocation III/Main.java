import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
              Scanner sc= new Scanner(System.in);
      int x=sc.nextInt();
      int y=sc.nextInt();
      int z=sc.nextInt();
      int n=sc.nextInt();
      int c=0;
      if(n<x)
      {c++;
      }
      if(n<y)
      {c++;}
      if(n<z)
      {
        c++;
      }
      System.out.println(c);
         
      }
    
}