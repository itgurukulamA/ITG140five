package ThreadsEx;

	class Th extends Thread
	{
		public void run()
		{
			for(int i=0;i<=5;i++)
			{
				try
				{
					Thread.sleep(+1000);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
				System.out.println(i);
			}
		}
	}
public class Demo3
{
	public static void main(String args[])
	{
		Th th=new Th();
		Th th1=new Th();
		System.out.println(th.getId());
		System.out.println(th.getName());
		th.setName("laxman");
		System.out.println(th.getName());
		System.out.println(th.getPriority());
		th.setPriority(2);
		System.out.println(th.getPriority());
		th.start();
		try
		{
			th.join();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(th.isAlive());
		System.out.println(th1.isAlive());
		th1.start();
	}
}