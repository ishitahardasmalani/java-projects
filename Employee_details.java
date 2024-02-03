import java.util.*;
import java.lang.*;

class Employee_details
{
    String name;
    int id,wage;
    int hours;
    void getData()
    {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        id = sc.nextInt();
        hours = sc.nextInt();
    }
    void display()
    {
        System.out.println(id + "\t" +name + "\t\t" + hours +"\t\t\t" +wage);
    }
    void calculate()
    {
        wage = 100*hours;
    }
}
class Hello
{
    public static void main(String args[])
    {
        int n=5;
        int i;

        Employee_details e[] = new Employee_details[n];

        for(i=0;i<n;i++)
        {
            e[i]=new Employee_details();

            System.out.println("Enter Employee Name,  Employee ID , Working hours : ");
            e[i].getData();
            e[i].calculate();        
        }

        System.out.println("ID\t NAME \t\t NO. OF HOURS\t\t WAGES");
        for(i=0;i<n;i++)
        {
            e[i].display();
        }
        System.out.println();
        int max =e[0].wage;
        int pos=0;
        for(i=0;i<n;i++)
        {
            if(e[i].wage>max)
            {
                max = e[i].wage;
                pos=i;                
            }   
        }
        System.out.println(" Employee with highest salary : "+e[pos].name);
    }
}
