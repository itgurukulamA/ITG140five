package Collections;
import java.util.*;
public class Demo9 {
		public static void main(String args[])
		{
			Set n= new TreeSet();
			n.add(1);
			n.add(3);
			n.add(6);
			n.add(4);
			//n.add("laxman");
			n.add(2);
			Iterator itr=n.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			Set e=new TreeSet();
			e.add("laxman");
			e.add("sriram");
			e.add("ramesh");
			e.add("abc");
			Iterator m=e.iterator();
			while(m.hasNext())
			{
				System.out.println(m.next());
			}
		}
}
