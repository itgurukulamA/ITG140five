package ExceptionEx;
import java.io.*;
public class FileNotExce {
	public static void main(String rags[])
	{
		try
		{
		File file=new File("Desktop:/miracle/sriram/Demo1.txt");
		FileReader fr = new FileReader(file);
		}catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
	}
}
