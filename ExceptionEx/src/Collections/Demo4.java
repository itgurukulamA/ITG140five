package Collections;
import java.util.*;
public class Demo4 {
		public static void main(String args[])
		{
			Vector<String> n=new Vector<String>();
			n.add("laxman");
			n.add("12");
			n.add("76.87");
			n.add("d");
			System.out.println(n);
			ListIterator<String> m=n.listIterator();
			while(m.hasNext())
			{
				System.out.println(m.next());
			}
			System.out.println(n.remove(2));
			System.out.println(n);
		}
}