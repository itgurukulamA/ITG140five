package exceptions;

import java.io.FileInputStream;
import java.io.InputStream;

public class filenotfoound {
	public static void main(String args[]) {
		try {
		InputStream is=new FileInputStream("c:\\data\\input-text.txt");
		int data=is.read();
	}
		catch(Exception e) {
			System.out.println(e);
		
	}
	}
}
