import java.io.*;

public class Demo3 {
	public static void main(String args[]) throws IOException
	{
		try
		{
		File n=new File("Demo.txt");
		n.createNewFile();
		FileWriter fw=new FileWriter(n);
		fw.write("Good Morning guys");
		FileReader fr=new FileReader(n);
		fr.read();
	       int i;    
	          while((i=fr.read())!=-1)    
	          System.out.print((char)i);    
	          fr.close(); 
	}catch(Exception e)
		{
		System.out.println(e);
		}
	}
}
