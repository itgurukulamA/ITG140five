import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("dhoni");
		al.add("rohith");
		//System.out.println(al);
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("ms");
		al1.add("kohli");
		al1.add("rohith");
		al1.add("rohith");

		
		/*
		 * System.out.println(al.addAll(al1)); System.out.println(al);
		 * System.out.println(al.remove(2)); System.out.println(al);
		 */
		//System.out.println(al.removeAll(al1));
		//System.out.println(al);
		/*
		 * System.out.println(al.retainAll(al1)); System.out.println(al);
		 * System.out.println(al.size());
		 */
		al.clear();
		System.out.println("after using clear method:"+al);
		System.out.println(al.isEmpty());
	}
}
