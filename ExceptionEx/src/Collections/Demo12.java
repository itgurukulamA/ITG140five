package Collections;
import java.util.*;
public class Demo12 {
		public static void main(String args[])
		{
			Map<Integer,String> m=new LinkedHashMap();
			m.put(45,"taniya");
			m.put(34,"ruhi");
			m.put(23,"jai");
			m.put(12,"rakesh");
			m.put(2,"34");
			for(Map.Entry<Integer, String> l:m.entrySet())
			{
				System.out.println(l.getKey()+" "+l.getValue());
			}
				    Map<Integer,String> n=new HashMap();
				    n.put(1,"laxman");
				    n.put(2,"suresh");
				    n.put(3,"karhik");
				    n.put(4,"sriram");
				    for(Map.Entry m1:n.entrySet())
				    {
				      System.out.println(m1.getKey()+" "+m1.getValue());
				    }
		}
}
