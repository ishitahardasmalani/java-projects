class MultiT{
	public static void main(String args[]){
		Even m1 = new Even("even");
		System.out.println(m1.getName());
		m1.start();
		Odd m2 = new Odd("odd");
		System.out.println(m2.getName());
		m2.start();
		}
	}
class Even extends Thread{
	Even(String n) {super(n);}
	public void run(){
		for(int i=0;i<=15;i=i+2)
		System.out.println(i);
		}
	}	
class Odd extends Thread{
	Odd(String n) {super(n);}
	public void run(){
		for(int i=1;i<=15;i=i+2)
			System.out.println(i);
		}
	}