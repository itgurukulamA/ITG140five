package ThreadsEx;

class Single implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
	}
}
public class Demo5
{
	public static void main(String args[])
	{
		Single th=new Single();
		Thread t=new Thread(th);
		//th.run();
		t.start();
	}
}
