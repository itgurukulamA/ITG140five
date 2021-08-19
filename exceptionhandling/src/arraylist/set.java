package arraylist;
import java.util.*;

public class set {
	public static void main(String args[]) {

	Set<String> s1=new HashSet<String>();
	s1.add("dinesh");
	s1.add("madhav");
	s1.add("meher");
	s1.add("ram");
	
	System.out.println("1"+s1);
	 Set<String> s2=new HashSet<String>();
	s2.add("sagar");
	s2.add("ram");
	s2.add("dhileep");
	s2.add("krishna");
	System.out.println(s2);
	
	
		s1.addAll(s2);
	System.out.println(s1);
	
		s2.remove("sagar");
	System.out.println(s2);
	
		s1.retainAll(s2);
	System.out.println(s1);
	
		s1.removeAll(s2);
	System.out.println(s1);
	
	
	int size=s2.size();
	System.out.println(size);
	
	
		s2.clear();
	System.out.println(s2);
	}
}


