class Threading {
	public static void main(String args[]){
		Multi m1 = new Multi("thread 1");
		Multi m2 = new Multi("thread 2");
		System.out.println(m1.getName());
		System.out.println(m2.getName());
		m1.start();
		m2.start();
		}
	}
class Multi extends Thread{
	Multi(String name) {super(name);}
	public void run(){System.out.println("Thread is running");}
	}