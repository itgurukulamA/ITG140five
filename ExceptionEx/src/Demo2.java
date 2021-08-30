
	/*
		try
		{
			int a=5/0;
		}catch(Exception e)
		{
			e.getMessage();
		}catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}
}
try
{
	int a=6/0;
}
finally
{
	try
	{
		int a=5/0;
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
}*/
interface Printable{
	void print();
}
interface Showable
{
	void print();
}
class Demo2 implements Printable,Showable
{
	public void print()
	{
		System.out.println("Hello");
	}
	public static void main(String args[])
	{
		Demo2 obj=new Demo2();
		obj.print();
	}
}
