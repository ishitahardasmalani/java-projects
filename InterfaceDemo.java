interface Calculation
{
  double PI=3.14159;
  double area();
}

class Rectangle implements Calculation
{
  double length,breadth;
  Rectangle(double l, double b)
  {
    length=l;
	breadth=b;
  }
  
  public double area()
  {
     return length*breadth;
  }
}

class Ellipse implements Calculation
{
   double rx,ry;
   Ellipse(double a, double b)
   {
     rx=a;
	 ry=b;
   }
   
   public double area()
   {
     return PI*rx*ry;
   }
}

class InterfaceDemo
{
  public static void main(String args[])
  {
      Calculation ref=null;
	  
	  ref=new Rectangle(4,5);
	  System.out.println("Area="+ ref.area());
	  
	  ref=new Ellipse(2,2.5);
	  System.out.println("Area="+ ref.area());
  }
}
