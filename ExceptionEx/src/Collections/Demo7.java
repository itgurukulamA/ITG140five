package Collections;
import java.util.*;
public class Demo7 {
	public static void main(String args[])
	{
		Set n=new HashSet();
		n.add(1);
		n.add(4);
		n.add("laxman");
		n.add(4.5f);
		n.add('c');
		n.add("laxman");
		Iterator itr=n.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		for(Object e:n)
		{
			System.out.println(e);
		}
	}
}
