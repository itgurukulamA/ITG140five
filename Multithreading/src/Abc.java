//All thread methods
//start()method 
public class Abc extends Thread{
public void run() {
	System.out.println("thread is running");
}
	public static void main(String[] args) {
		Abc t1=new Abc();
		t1.start();

	}

}

//run() method
/*
 * public class Abc implements Runnable{ public void run() {
 * System.out.println("Thread is running"); } public static void main(String[]
 * args) { Abc a1=new Abc(); Thread t1=new Thread(a1); t1.start(); } }
 */