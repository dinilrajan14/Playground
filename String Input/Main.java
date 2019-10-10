import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
class Main
{
    public static void main(String args[]) throws NumberFormatException,IOException
    {
      BufferedReader br= new BufferedReader( new InputStreamReader(System.in)) ;
      String x;
      x=br.readLine();
      System.out.println(x);
    }
}