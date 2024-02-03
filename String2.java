import java.util.*;
import java.io.*;
class String2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int upper=0,lower=0,digit=0,space=0,sp=0;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			System.out.println(ch);
			if(ch>='A' && ch<='Z')
			upper++;
			else if(ch>='a' && ch<='z')
			lower++;
			else if(ch>='0' && ch<='9')
			digit++;
			else if(ch>=' ')
			space++;
			else
			sp++;
			}
			System.out.println("upper "+upper);
			System.out.println("lower "+lower);
			System.out.println("digit "+digit);
			System.out.println("space "+space);
			System.out.println("sp "+sp);
	}
}
