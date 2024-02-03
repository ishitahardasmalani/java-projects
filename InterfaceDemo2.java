interface Teacher
{
   void makeProject();
}

class Person
{
   String name;
   Person()
   {
       name="Karsi";
   }
   
   Person(String n)
   {
      name=n;
   }
   
   void display()
   {
      System.out.println("Name:"+ name);
   }
}

class Student extends Person implements Teacher
{
    String projectName;
	
	Student()
	{
	   projectName="Student Management System";
	}
	
	Student(String n,String p)
	{
	  super(n);
	  projectName=p;
	}
	
	public void makeProject()
	{
	   System.out.println("")
	}

	
	
}