import java.util.Scanner;
class Main
{
    public static void main(String args[])

    {
        Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
         int sum=0, a=0,b=0,c=1;
      System.out.print(a+" ");
       System.out.print(b+" ");
       System.out.print(c+" ");
      
        
   
        for(int i=0;i<n-3;i++)
        {
           sum=a+b+c;
          a=b;
          b=c;
          c=sum;
           System.out.print(sum+" ");
        }
          
         
           
        
    }
}