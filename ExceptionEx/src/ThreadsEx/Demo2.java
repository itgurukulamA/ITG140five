package ThreadsEx;

public class Demo2 implements Runnable{

	public void run() {
		System.out.println("hello Running.....!");
	}
	public static void main(String args[])
	{
		Demo2 n=new Demo2();
		Thread t=new Thread(n);
		t.start();
	}

}
