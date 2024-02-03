class SSC_Student
{
    String name;
	int roll_no;
	double per;
	
	SSC_Student()
	{ 
	   name="XYZ";
	   roll_no=1;
	   per=75;
	}
	
	SSC_Student(String n)
	{ 
	   name=n;
	   roll_no=1;
	   per=75;
	}
	
	SSC_Student(int r)
	{ 
	   name="XYZ";
	   roll_no=r;
	   per=75;
	}
	SSC_Student(String n, int r)
	{ 
	   name=n;
	   roll_no=r;
	   per=75;
	}
	
	SSC_Student(String n, int r, double pe)
	{ 
	   name=n;
	   roll_no=r;
	   per=pe;
	}
	
	SSC_Student(SSC_Student s)
	{ 
	   this.name=s.n;
	   this.roll_no=s.r;
	   this.per=s.pe;
	}
	
	public void display()
	{
		System.out.println("Nmae:"+this.name);
		Sytem.out.println("Roll no:"this.roll_no);
		System.out.println("Percentage:"+this.per);
		System.out.println();
		
	}
}

class Science_Student extends SSC_Student
{
	int p,c,m;
	Science_Student()
	{
		super();
		p=100;
		c=100;
		m=100;
	}
	
	Science_Student(String n)
	{
		super(n);
		p=100;
		c=100;
		m=100;
	}
	Science_Student(int r)
	{
		super(r);
		p=100;
		c=100;
		m=100;
	}
	
	Science_Student(String n, int r)
	{
		super(n,r);
		p=100;
		c=100;
		m=100;
	}
	
	Science_Student(String n, int r, double pe)
	{
		super(n,r,pe);
		p=100;
		c=100;
		m=100;
	}
	
	Science_Student(String n, int r, double p, int p, int c, int m)
	{
		super(n,r,pe);
		this.p=p;
		this.c=c;
		this.m=m;
	}
	
	Science_Student(Science_Student s)
	{
		super(n,r,pe);
		this.p=s.p;
		this.c=s.c;
		this.m=s.m;
	}
}
