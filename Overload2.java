import java.util.Scanner;
class Overload2
{
public static void main(String args[])
 {
   int s,a,b;
   double r;
   
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter the side of square:");
    s=sc.nextInt();
   System.out.println("Enter the length and breadth of rectangle:");
    a=sc.nextInt();
    b=sc.nextInt();
   System.out.println("Enter the radius of the circle:");
    r=sc.nextDouble();
   Area ob= new Area(s);
   Area ob1= new Area(r);
   Area ob2= new Area(a,b);
  
   
  
 }
}

class Area
{
    int s,a,b;
	double r;
	Area(int s)
	{
		System.out.println("Area of Sqaure:"+(s*s));
	}
	
	Area(double r)
	{
		System.out.println("Area of Circle:"+(3.14*r*r));
	}
	
	Area(int a, int b)
	{
		System.out.println("Area of Rectangle:"+(a*b));
	}
}