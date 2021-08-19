package arraylist;

import java.util.*;

public class arraylist {
	private static final String ArrayList = null;

	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Madhu");
		al.add("Dinesh");
		al.add("Lokesh");
		al.add("sashank");
		
		  Iterator itr=al.iterator(); while(itr.hasNext())
		  System.out.println(itr.next());
		  
		  
		  System.out.println("remaining elements:"+(al.get(2))); al.set(3,"meher");
		  
		  Collections.sort(al);
		 
		for (String names : al)
			System.out.println(names);
	}
}
