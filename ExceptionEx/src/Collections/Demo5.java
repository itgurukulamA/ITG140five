package Collections;
import java.util.*;
public class Demo5 {
		public static void main(String args[])
		{
			List al=new ArrayList();
			al.add(1);
			al.add(2);
			al.add(3);
			al.add(4);
			al.add(7);
			System.out.println(al);
			Iterator itr=al.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			List al1=new ArrayList();
			al1.add(1);
			al1.add(5);
			al1.add(6);
			al1.add(7);
			al1.add(8);
			System.out.println(al1);
			Iterator itr1=al1.iterator();
			while(itr1.hasNext())
			{
				System.out.println(itr1.next());
			}
			System.out.println(al.removeAll(al1));
			System.out.println(al);
			System.out.println(al1.removeAll(al));
			System.out.println(al1);
			System.out.println(al);
			System.out.println(al.retainAll(al1));
			System.out.println(al);
			System.out.println(al1);
			System.out.println(al1.retainAll(al));
			System.out.println(al1);
			System.out.println(al.addAll(al1));
			System.out.println(al);
		}
}
