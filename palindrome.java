import java.io.*;
class Palindrome
{
	static boolean isPalindrome(String str)
	{
		int i,j;
		i=0;
		j=str.length()-1;
		while(i<j)
		{
			if(str.charAt(i)==str.charAt(j))
			{
				i++;
				j--;
			}
			else
				return false;
			return true;
		}
		return false;
		
	}
	public static void main(String args[])throws IOException
	{
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String");
		str=br.readLine();
		str=str.toLowerCase();
		if(isPalindrome(str))
			System.out.println("String is a palindrome");
		else
			System.out.println("String is not a palindrome");
	}
}	
