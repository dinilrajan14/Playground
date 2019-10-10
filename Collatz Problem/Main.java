import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
          Scanner sc= new Scanner(System.in);
      int a=sc.nextInt();
       System.out.println(a); 
      
       int c=0;
 
      while(a!=1)
      {  
        if(a%2==1)
      {
        a=(3*a+1);
          c++;
          System.out.println(a); 
      }
      else
      {
        a=a/2;
        c++;
      System.out.println(a); 
      }
      }
      System.out.println(c);  
    }
}