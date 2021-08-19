package ThreadsEx;

class ThEx1 extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
		}
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class Demo6
{
	public static void main(String args[])
	{
		ThEx1 n1=new ThEx1();
		ThEx1 n2=new ThEx1();
		n1.start();
		n2.start();
	}
}