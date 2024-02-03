package p1;
import java.util.*;
public class Employee
{
   String name;
   int salary;
   
   public Employee()
   {
     name="ABC";
	 salary=100;
   }
   
   public Employee(String n, int s)
   {
      name=n;
	  salary=s;
   }
   
   public void getDetails()
   {
     Scanner sc= new Scanner(System.in);
	 System.out.println("Enter name:");
	 name=sc.nextLine();
	 System.out.println("Enter Salary:");
	 salary=sc.nextInt();
   }
   
   public void display()
   {
      System.out.println("Employee name:"+ name);
	  System.out.println("Employee salary:"+ salary);
   }
}