import java.util.*;
import java.lang.*;

class Student_Details
{
    String name;
    int math,total;
    int phy,chem;

    void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        name = sc.nextLine();
        System.out.println("Enter Math Marks : ");
        math = sc.nextInt();
        System.out.println("Enter Physics Marks :");
        phy = sc.nextInt();
        System.out.println("Enter Chemistry Marks :");
        chem = sc.nextInt();
    }
    void display()
    {
        System.out.println(name +"\t\t" +math +"\t\t\t" +phy +"\t\t\t" +chem +"\t\t\t" +total);
    }
    void calculate()
    {
        total = math+phy+chem;
    }
}
class Hello
{
    public static void main(String h[])
    {
        int n=5,i;
        Student_Details s[] = new Student_Details[n];
        for(i=0;i<n;i++)
        {
            s[i]=new Student_Details();
            s[i].getData();
            s[i].calculate();        
        }
        System.out.println("Name\t\t Math \t\t Physics\t\t Chemistry \t\t Total");
        for(i=0;i<n;i++)
        {
            s[i].display();
        }
        System.out.println();
        int max =s[0].total;
        int pos=0;
        for(i=0;i<n;i++)
        {
            if(s[i].total>max)
            {
                max = s[i].total;
                pos=i;                
            }   
        }
        System.out.println(" Student with highest marks : "+s[pos].name);
    }
}
