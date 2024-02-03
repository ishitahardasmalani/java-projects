class Inheritance{
	public static void main(String args[]){
		Teacher tc = new Teacher(34,"Ishi","Gaon","Comp","S.E.");
		Typist ty = new Typist(100,98,"Amir","KALYAN");
		Officer of = new Officer("A+",156,"Tiya","Thane");
		Regular rg = new Regular(10,1056000,12,"Akshat","BKC chawl");
		Adhoc ad = new Adhoc(120,100,123,"Karan","Out of league");
		tc.display();
		ty.display();
		of.display();
		rg.display();
		ad.display();
		}
	}
	
class Staff{
	int code;
	String name,add;
	Staff(int c, String n, String a){
		code=c;
		name=n;
		add=a;
		}
	void display(){
		System.out.println("code: "+code+"\n"+"name: "+name+"add: "+add);
		}	
	}

class Teacher extends Staff{
	String sub,cla;
	Teacher(int c,String n,String a,String s,String cl){
		super(c,n,a);
		sub=s;
		cla=cl;
		
		}
	void display(){
		super.display();
		System.out.println("Subject: "+sub+"\n"+"class: "+cla);
		}
	}		

class Typist extends Staff{
	int speed;
	Typist(int s,int c,String n,String a){
		super(c,n,a);
		speed=s;
		}
		void display(){
		super.display();
		System.out.println("speed: "+speed);
		}
	}
	
	class Officer extends Staff{
	String grade;
	Officer(String g,int c,String n,String a){
		super(c,n,a);
		grade=g;
		}
		void display(){
		super.display();
		System.out.println("grade: "+grade);
		}
	}
	
class Regular extends Typist{
	int basicPay;
	Regular(int s,int sal,int c,String n,String a){
		super(s,c,n,a);
		basicPay=sal;
		}
		void display(){
		super.display();
		System.out.println("Regular: "+basicPay);
		}
	}

class Adhoc extends Typist{
	int basicPay;
	Adhoc(int s,int sal,int c,String n,String a){
		super(s,c,n,a);
		basicPay=sal;
		}
		void display(){
		super.display();
		System.out.println("Ad-Hoc: "+basicPay);
		}
	}