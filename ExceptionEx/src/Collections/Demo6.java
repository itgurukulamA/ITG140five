package Collections;
import java.util.*;
public class Demo6 {
	public static void main(String args[])
	{
		List al = new ArrayList();
		al.add("laxman");
		al.add("234");
		al.add(2);
		al.add(6.7f);
		al.add(null);
		al.add(null);
		for(Object i:al)
		{
			System.out.println(i);
		}
		Iterator n=al.iterator();
		while(n.hasNext())
		{
			System.out.println(n.next());
		}
	}
}
