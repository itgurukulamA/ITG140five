package Collections;
import java.util.*;
public class Demo2 {
	public static void main(String args[])
	{
		List n=new ArrayList();
		n.add("laxman");
		n.add(0,"suresh");
		n.add(1,"234");
		n.add("ram");
		//n.clear();
		System.out.println(n);
		try
		{
		n.remove(4);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		n.add(45.46);
		System.out.println(n);
		n.remove(2);
		System.out.println(n);
		System.out.println(n.size());
		System.out.println(n.isEmpty());
		System.out.println(n);
		System.out.println(n.contains("laxman"));
		System.out.println(n.contains("ram"));
		System.out.println(n.hashCode());
		System.out.println(n.set(2,"raju"));
		System.out.println(n);
		System.out.println(n.lastIndexOf("kumar"));
		System.out.println(n.lastIndexOf(45.46));
		System.out.println(n.toString());
	}
}
