import java.util.Scanner;
public class sample
{

    static int function (int a)
{
   int sum=0;

   for(int i=0;i<=a;i++)
   {
    sum=sum+i;
   }
   return sum;
}

public static void main (String args[])

{
    Scanner sc=new Scanner (System.in);
    int a=sc.nextInt();
    
    System.out.println("the minimum is "+function(a));
}}