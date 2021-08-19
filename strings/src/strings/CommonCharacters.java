package strings;
import java.util.Scanner;
public class CommonCharacters {
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter two strings:");
		String s1=obj.next();
		String s2=obj.next();
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					System.out.println(s1.charAt(i));
					
				}
			}
		}
	}
}
