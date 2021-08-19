package StringEx;
import java.util.*;
public class ReverseEx {
	public static void main(String[] args) {
	String initial,rev="";
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string");
	initial=sc.nextLine();
	int len=initial.length();
	for(int i=len-1;i>=0;i--) {
	rev=rev+initial.charAt(i);
	}
	System.out.println("Reverse of String:"+rev);
	}

	}
