public class Multi extends Thread
{
	public void run()
	{
		System.out.println("Hello World");
	}
	public static void main(String args[])
	{
		Multi m=new Multi();
		Thread n=new Thread(m);
		n.run();
		n.start();
		n.start();
		n.run();
	}
}
