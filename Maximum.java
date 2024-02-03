import java.util.*;
import java.io.*;

class Maximum
{
	public static void main(String args[])
	{
		Maximum max= new Maximum();
		Scanner sc= new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Enter first number:");
		a=sc.nextInt();
		System.out.println("Enter second number:");
		b=sc.nextInt();
		System.out.println("Enter third number:");
		c=sc.nextInt();
		
		System.out.println("Maximum number is:"+max.maximum(a,b,c));
         
	}
}

class Number
{
	int maximum(int a,int b,int c)
	{
		int max=(a>b)? ((a>c)? (a): (c)): ((b>c)? (b): (c));
		return max;
	}
}
