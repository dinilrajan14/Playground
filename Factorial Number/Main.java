import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner (System.in);
     int flag=0;
      int n=sc.nextInt();
      int fact=1;
      for(int i=1;i<n;i++)
      {
        fact=fact*i;
      if (n==fact)
      {
        flag=1;
        break;
      }
        else
          flag=0;
      }
    if (flag==1)
    {
      System.out.println("Yes");
    }
        else
        System.out.println("No") ;  
    
      }  
     
    
}