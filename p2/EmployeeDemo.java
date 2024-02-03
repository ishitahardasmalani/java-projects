package p2;
import p1.*;
import java.util.*;

class Programmer extends Employee
{
   String project_name;
   
   Programmer()
   {
      super();
	  project_name="TIMEPASS";
   }
   
   Programmer(String n, int s, String pn)
   {
     super(n,s);
	 project_name= pn;
   }
   
   public void getDetails()
   {
     super.getDetails();
     Scanner sc= new Scanner(System.in);
	 System.out.println("Enter Project name:");
	 project_name=sc.nextLine();
	 
   }
   
   public void display()
   {
      super.display();
      System.out.println("Project name:"+ project_name);
	  
   }
}

class HR extends Employee
{
String department;
   
   HR()
   {
      super();
	  department="REGRET";
   }
   
   HR(String n, int s, String d)
   {
     super(n,s);
	 department= d;
   }
   
   public void getDetails()
   {
     super.getDetails();
     Scanner sc= new Scanner(System.in);
	 System.out.println("Enter Department:");
	 department=sc.nextLine();
	 
   }
   
   public void display()
   {
      super.display();
      System.out.println("Department:"+ department);
	  
   }
}

class EmployeeDemo
{

public static void main(String args[])
{

  Employee e1= new Employee();
  e1.getDetails();
  e1.display();
  
  Programmer p1=new Programmer();
  p1.getDetails();
  p1.display();
  
  HR h1= new HR();
  h1.getDetails();
  h1.display();
  
  
}

}