package Collections;
import java.util.*;
public class Demo1 {
public static void main(String args[])
{
	List n=new ArrayList();
	n.add(12);
	n.add("laxman");
	n.add(456.38);
	n.add("Suresh");
	n.add('r');
	n.add(12);
	n.add("laxman");
	System.out.println(n);
	System.out.println(n.remove(2));
	System.out.println(n);
	System.out.println(n.size());
	System.out.println("=========");
	List m=new ArrayList();
	m.add(10);
	m.add("laxman");
	m.add('h');
	m.add("suresh");
	m.add(35.54);
	System.out.println(n.removeAll(m));
	System.out.println(n);
	System.out.println(n.retainAll(m));
	System.out.println(n);
	System.out.println(m.size());
	System.out.println(m);
	System.out.println(m.contains(34));
	System.out.println(m.contains("laxman"));
	System.out.println(m.get(4));
	System.out.println("========");
	System.out.println(n.addAll(m));
	System.out.println(n);
	System.out.println(n.size());
	System.out.println(m);
	System.out.println(n.retainAll(m));
	System.out.println(n);
	System.out.println(n.removeAll(m));
	System.out.println(n);
	System.out.println(n.isEmpty());
}
}
