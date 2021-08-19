package strings;
import java.util.*;
public class palindrome {
    static boolean Palindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
        	if (str.charAt(i) != str.charAt(j))
                return false;
        	i++;
        	j--;
        }
		return true;
    }
    public static void main(String args[]) {
    	
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string to check:");
    String s=sc.nextLine();
if (Palindrome(s)) 
	System.out.println("your string is a palindrom");
else
	System.out.println("your string is not a palindrom");
    }
}
