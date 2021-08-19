package ThreadsEx;

class Example
{
	synchronized static void display(int a)
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i*a);
			try
			{
				Thread.sleep(500);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
public class Demo8 extends Thread
{
	public void run()
	{
		Example.display(4);
	}
public static void main(String args[])
{
		Demo8 n=new Demo8();
		n.start();
}
}