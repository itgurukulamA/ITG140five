package ExceptionEx;

public class ArrayIndex {
	public static void main(String args[])
	{
		try
		{
			int a[]=new int[5];
			a[0]=3;
			a[1]=4;
			a[2]=7;
			a[3]=6;
			a[4]=9;
			a[5]=7;
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
}
