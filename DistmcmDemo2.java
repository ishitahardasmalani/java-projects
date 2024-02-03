import java.util.*;

class Distmcm
{
	intm,cm;
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
	// d3=d1.add(d2)
	public Distmcm add(Distmcm x)
	{
		Distmcm temp=new Distmcm();
		temp.m=this.x+x.m;
		temp.cm=this.cm+x.cm;
		if(temp.cm>=100)
		{
			temp.cm=temp.cm-100;
			temp.m++;
		}
		
		return temp;
	}
}

class DistmcmDemo
{
	public static void main(String args[])
	{
		Distmcm d1 =new Distmcm();
		Distmcm d2 =new Distmcm();
		Distmcm d3;
		
		d1.readDistance();
		d1.displayDistance();
		
		d2.readDistance();
		d2.displayDistance();
		
		d3=d1.add(d2);
		// add is a function which is called
		//for object d1, d2 is passed as parameter
		//and it returns addition distance which is
		//stored in d3
		
		System.out.println("Addition:");
		d3.displayDistance();
		
		
	}
}