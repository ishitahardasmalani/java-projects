import java.util.Scanner;
class Overload
{
public static void main(String args[])
 {
   int s,a,b;
   double r;
   Area ob= new Area();
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter the side of square:");
    s=sc.nextInt();
   System.out.println("Enter the length and breadth of rectangle:");
    a=sc.nextInt();
    b=sc.nextInt();
   System.out.println("Enter the radius of the circle:");
    r=sc.nextDouble();
   ob.area(r);
   ob.area(s);
   ob.area(a,b);
   
  
 }
}

class Area
{
	void area(int s)
	{
		System.out.println("Area of Sqaure:"+(s*s));
	}
	
	void area(double r)
	{
		System.out.println("Area of Circle:"+(3.14*r*r));
	}
	
	void area(int a, int b)
	{
		System.out.println("Area of Rectangle:"+(a*b));
	}
}