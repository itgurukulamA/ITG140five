package ExceptionEx;

import java.io.*;

public class Demo1 extends Exception{
	public static  void main(String args[]) throws IOException
	{
		try
		{
		File n=new File("demo1.txt");
		n.createNewFile();
		FileWriter fw=new FileWriter(n);
		fw.write("Hello guys good morining");
		fw.close();
		FileReader fr=new FileReader(n);
		char a[]=new char[50];
		fr.read(a);
		for(Object b:a)
		{
			System.out.println(b);
		}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
