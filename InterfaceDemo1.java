interface MyInterface
{
 void display();
}

class Student implements MyInterface
{
  String name;
  Student()
  {
      this("Nitesh");
  }
  
  Student(String n)
  {
      name=n;
  }
  
  public void display()
  {
     System.out.println("Name of student:"+name);
  }
}

class ComplexNumber implements MyInterface
{
  double x,y;
  ComplexNumber()
  {
     this(2,3);
  }
  
  ComplexNumber(double x,double y)
  {
      this.x=x;
	  this.y=y;
  }
  
  public void display()
  {
     System.out.println(x+"+("+y+")i");
  }
}

class InterfaceDemo1
{
	public static void main(String args[])
	{
		MyInterface ref;
		ComplexNumber c1=new ComplexNumber();
		Student s1=new Student();
		ref=c1;
		ref.display();
		ref=s1;
		ref.display();
		
	}
	
}