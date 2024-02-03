class Demo2
{
	public static void main(String args[])
	{
		int x;
		x=Integer.parsenInt(args[0]);
		//parseInt is a static function of
        //class Integer which accepts 
		// String as argument and converts into int
		//and returns that int 
		
		if(x%2==0)
		{
			System.out.println(x+" is even");
		}
		else 
		{
			System.out.println(x+" is odd");
		}
	}
}