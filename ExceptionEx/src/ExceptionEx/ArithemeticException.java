package ExceptionEx;
import java.util.Scanner;
public class ArithemeticException
{
public static void main(String rags[])
{
try
{
System.out.println("Enter anumber ");
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
}
