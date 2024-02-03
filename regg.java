import java.util.*;
class regg extends Exception
{
    regg(String str)
   {
    super(str);
   }
  public static void main(String h[])
 {
   Scanner sc=new Scanner(System.in);
   int wt,age;
   System.out.println("enter age:");
   age=sc.nextInt();
   System.out.println("enter weight:");
   wt=sc.nextInt();
 try
{
   if(age<=10 || wt<=40)
{
  regg r = new regg("Registration failed");
  throw r;
}
else
{
   System.out.println("Registered Success\n");
}
}
catch(regg r)
{
 System.out.println("exception\t" + r);
}
}
}

