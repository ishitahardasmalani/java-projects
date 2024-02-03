import java.util.*;
class error2{
	void test(int a)throws Exception2{
		if(a>25000 && a<50000) 
		System.out.println("valid");
		else 
		throw new Exception2("PayOutOfBounds");
		}
	public static void main(String args[])
	{
		System.out.println("Enter number:");
		Scanner sc =new Scanner(System.in);
		error2 er = new error2();
		int a = sc.nextInt();
		try{
		er.test(a);
		}
		catch(Exception ex){System.out.println("error "+ex);}
	}
	}
class Exception2 extends Exception{
	Exception2(String s){
		super(s);
		}
	}