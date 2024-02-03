import java.util.*;
class Three
{
	public static void main(String[] args)
	{
		int ans;
		max q= new max();


		System.out.println("Enter 3 numbers:");
		int x = q.data();
		int y = q.data();
		int z = q.data();

		ans=q.maximum(x,y,z);
		System.out.println("Maximum:"+ans);
	
	}

}
class max
{
	int data()
	{
		Scanner m = new Scanner(System.in);
		int n = m.nextInt();
		return n;
	}

	int maximum(int x,int y,int z)
	{
		int sol;
		sol=(x>y)?(x>z?x:z):(y>z?y:z);
		return sol;
	}
}