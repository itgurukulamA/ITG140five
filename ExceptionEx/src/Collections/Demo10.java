package Collections;
import java.util.*;
import java.util.Map.Entry;
public class Demo10 {
		public static void main(String args[])
		{
			Map<Integer,String> m=new HashMap<Integer,String>();
			m.put(5,"laxman");
			m.put(2, "suresh");
			m.put(3,"rakesh");
			m.put(1,"ram");
			/*Set s=m.entrySet();
			/Iterator itr=s.iterator();
			/while(itr.hasNext())
			{
				Map.Entry em=(Entry) itr.next();
				System.out.println(em.getKey()+" "+em.getValue());
			}*/
			for(Map.Entry e :m.entrySet())
			{
				//System.out.println(e.getKey()+" "+e.getValue());
			}
			m.remove(3);
			m.replace(2,"sriram");
			for(Map.Entry e2:m.entrySet())
			{
				System.out.println(e2.getKey()+" "+e2.getValue());
			}
		}
}
