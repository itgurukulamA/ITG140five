package ThreadsEx;

public class Demo7 extends Thread{
	public void run()
	{
		for(int i=0;i<=3;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		Demo7 d=new Demo7();
		d.run();
	}
}
