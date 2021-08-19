package exceptions;

public class numberedcast {
public static void main(String args[]) {
	try {
	int i=Integer.parseInt("dinesh");
	System.out.println("the value of i" +i);
	}catch(Exception e) {
		System.out.println(e);
	}
}
}
