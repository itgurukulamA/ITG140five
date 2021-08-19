package exceptions;

public class arrayoutbound {
public static void main(String args[]) {
	

try{ 
	int a[]=new int[5];
		a[6]=5;	
}
catch(Exception e) {
	System.out.println(e);
}
}
}