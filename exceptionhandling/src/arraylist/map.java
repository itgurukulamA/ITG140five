package arraylist;

import java.util.*;
public class map {
public static void main(String args[]) {
	Map<Integer,String> hm= new TreeMap<>();
	 hm.put(1,"html");
	 hm.put(2,"python");
	 hm.put(3,"java");
	 hm.put(4,"angular");
	 
	 Set s=hm.entrySet();
	 Iterator i=s.iterator();
	 while(i.hasNext())
	 {
		 Map.Entry entry= (Map.Entry)i.next();
	 System.out.println(entry.getKey()+" "+entry.getValue());
	 
	 }
}
}