package exceptions;

public class arthimetic {
public static void main(String args[]) {
	try {
		int a=22;
		int b=0;
		int c=a/b;
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
