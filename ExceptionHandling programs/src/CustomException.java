import java.util.Scanner;

public class CustomException extends Exception{
		public static void main(String args[])
		{
		System.out.println("Enter a Number: ");
		Scanner n=new Scanner(System.in);
		int a=n.nextInt();
		try
		{
		if(a==5)
		{
		throw new Exception();
		}
		else
		{
		System.out.println("Student are attended");

		}
		}catch(Exception e)
		{
		//System.out.println("student is dropped");
		e.printStackTrace();
		}
		}
		
	}


