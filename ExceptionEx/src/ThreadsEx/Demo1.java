package ThreadsEx;

public class Demo1 extends Thread {
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		Demo1 n=new Demo1();
		n.start();
	}
}