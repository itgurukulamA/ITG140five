import java.util.Scanner;

public class Arithmeticexception {

	public static void main(String[] args) {
		{
		try
		{
		System.out.println("Enter a number ");
		Scanner n=new Scanner(System.in);
		int a=n.nextInt();
		int b=n.nextInt();
		int result=a/b;
		System.out.println("The result is "+result);
		}catch(ArithmeticException e)
		{
		System.out.println(e);
		}
		}
	}}
