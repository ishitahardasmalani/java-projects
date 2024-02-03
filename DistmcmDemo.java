import java.util.*;

class Distmcm
{
	int m,cm;
	Distmcm()
	{
		m=0;
		cm=0;
	}
	
	Distmcm(int m)
	{
		this.m=m;
		this.cm=0;
	}
	
	
	Distmcm(int m,int cm)
	{
		this.m=m;
		this.cm=cm;
	}
	
	Distmcm(Distmcm d)
	{
		this.m=d.m;
		this.cm=d.cm;
	}
	public void readDistance()
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter metre:");
        m=sc.nextInt();
 
        System.out.println("Enter centimeter:");
        cm=sc.nextInt();		
	}
	
	public void displayDistance()
	{
		System.out.println(this.m+" meter "+this.cm+" centimeter");
		
	}
	//d3.add(d1,d2);
	public void add(Distmcm x,Distmcm y)
	{
		this.m=x.m+y.m;
		this.cm=x.cm+y.cm;
		if(this.cm>=100)
		{
			this.cm=this.cm-100;
			this.m++;
		}
	}
}


class DistmcmDemo
{
	public static void main(String args[])
	{
		Distmcm d1 =new Distmcm();
		Distmcm d2 =new Distmcm();
		Distmcm d3 =new Distmcm();
		
		d1.readDistance();
		d1.displayDistance();
		
		d2.readDistance();
		d2.displayDistance();
		
		d3.add(d1,d2);
		
		System.out.println("Addition:");
		d3.displayDistance();
		
		
	}
}