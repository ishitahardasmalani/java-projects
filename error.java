import java.util.*;
class error{
	void test(int a)throws Exception1{
		if(a==5 || a==6 || a==7)System.out.println("no is 5,6,7");
		else throw new Exception1("Not valid");
		}
	public static void main(String args[])
	{
		System.out.println("Enter number:");
		Scanner sc =new Scanner(System.in);
		error er = new error();
		int a = sc.nextInt();
		try{
		er.test(a);
		}
		catch(Exception ex){System.out.println("error "+ex);}
	}
	}
	
class Exception1 extends Exception{
	Exception1(String s){
		super(s);
		}
	}