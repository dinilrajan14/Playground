import java.util.Scanner;
class Main
{
    public static void main(String args[])
    
    {
     Scanner sc= new Scanner (System.in);
      int a,b,d,as,ar;
      float c;
  
      a=sc.nextInt();
      b=sc.nextInt();
       d=sc.nextInt();
      c=sc.nextFloat();
   
      as=a*a;
      ar=d*b;
      double ac=3.14*c*c;
      System.out.println(as);
      System.out.println(ar);
      System.out.printf("%.3f",ac); 
                         
       
    }
}