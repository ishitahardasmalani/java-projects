import java.util.*;
class bal extends Exception
{
bal(String str)
{
super(str);
}
public static void main(String h[])
{
int balance, withdrawl, num;
Scanner sc = new Scanner(System.in);
do
{
System.out.println("Enter Balance : ");
balance = sc.nextInt();
System.out.println("Enter withdrawl amount: ");
withdrawl = sc.nextInt();
try
{
if(withdrawl > balance)
{
bal b = new bal("Insufficient balance");
throw b;
}
else
System.out.println("Withdrawl is successful");
}
catch(bal b)
{
System.out.println("exception "+b);
}
System.out.println("Press -1 to stop withdrawing");
num = sc.nextInt();
}while(num!=-1);
}
}
