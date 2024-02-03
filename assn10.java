import java.util.*;
public class assn10
{
public static void main(String args[])
{
try
{
     int num=5/0;
}
catch(ArithmeticException e)
{
    System.out.println("Arithmetic Error.");
} try
{
   int num=Integer.parseInt("Hello.");
}
catch(NumberFormatException e)
{
     System.out.println("Number Format Error.");
} try
{
   int a[]= new int [3];
   int c= a[4];
}
catch(ArrayIndexOutOfBoundsException e)
{
  System.out.println("Array Index Error.");
}
}
}
