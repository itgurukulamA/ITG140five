import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {
public static void main(String[] args) {
	
	
	 ArrayList<String> al= new ArrayList<String>();
	 al.add("swethak");
	 al.add("santosh"); 
	 al.add("saikiran");
	 
System.out.println(al);
}
}
/*
 * Iterator itr= al.iterator(); while(itr.hasNext()) {
 * System.out.println(itr.next()); }
 * 
 * } }
 */
/*
 * for(String names:al) { System.out.println(names); }
 * 
 * } }
 * 
 * System.out.println("returning element:"+al.get(1)); al.set(2,"venky");
 * for(String names:al) { System.out.println(names); }
 */
/*
 * Collections.sort(al); for(String names:al) { System.out.println(names); }
 */
/*
 * ArrayList<Integer> al= new ArrayList<Integer>(); al.add(21); al.add(11);
 * al.add(51); al.add(1); Collections.sort(al); for(Integer values:al) {
 * System.out.println(values); }
 */

/*
 * ArrayList<String> list= new ArrayList<String>(); list.add("Ravi");
 * list.add("Vijay"); list.add("Ravi"); list.add("Ajay");
 * 
 * System.out.println("Traversing list through List Iterator:");
 * ListIterator<String> list1=list.listIterator(list.size());
 * while(list1.hasPrevious()) { String str= list1.previous();
 * System.out.println(str); }
 * 
 * for(int i=0;i<list.size();i++) { System.out.println(list.get(i));
 * 
 * } } }
 */
