package Collections;
import java.util.*;
public class Demo8 {
	public static void main(String args[])
	{
		Set n=new LinkedHashSet();
		n.add("laxman");
		n.add("jai");
		n.add(3);
		n.add(46.7);
		Iterator itr=n.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		for(Object t:n)
		{
			System.out.println(t);
		}
		System.out.println(n.remove(3));
		System.out.println(n.isEmpty());
		System.out.println(n.contains(3));
		System.out.println(n.contains("laxman"));
	}
}
