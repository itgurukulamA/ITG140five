package exceptions;

public class stringoutofbound {
public static void main(String args[]) {
	String str="this is miracle training";
	try {
		str.charAt(35);
	}
 catch(Exception e) {
	  System.out.println(e);
 }
}
}
