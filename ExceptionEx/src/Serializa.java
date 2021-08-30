import java.io.*;
public class Serializa {
	private int number;

	public static void main(String args[])
	{
		Serializa emp=new Serializa();
		emp.number=767568;
		try
		{
			FileOutputStream fout=new FileOutputStream("employee.ser");
			ObjectOutputStream fin=new ObjectOutputStream(fout);
			fin.writeObject(emp);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
