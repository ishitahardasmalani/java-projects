import java.util.*;
class employeedetails
{
	String name;
	String dept;
	String post;
	int id;

	void data()
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Employee Name:");
		name=sc.next();

		System.out.println("Department Name:");
		dept=sc.next();

		System.out.println("Enter post:");
		post=sc.next();

		System.out.println("Employee id:");
		id=sc.nextInt();

	}

	void print()
	{
		System.out.println("Employee Name:" +name);
		System.out.println("Department Name:"+dept);
		System.out.println("Post:"+post);
		System.out.println("Employee id:"+id);

	}

	public static void main(String[] args) 
	{
		employeedetails a= new employeedetails();
		a.data();
		a.print();

	}


}