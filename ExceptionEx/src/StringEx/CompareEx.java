package StringEx;
import java.util.*;
public class CompareEx {
	public static void main(String[] args)
	{
	int i,value=1,l1,l2;
	String s1,s2;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the 1st string");
	s1=sc.nextLine();
	System.out.println("Enter the 2nd string");
	s2=sc.nextLine();
	l1=s1.length();
	l2=s2.length();
	char str1[] = s1.toCharArray();
	char str2[] = s2.toCharArray();
	    if(l1==l2)
	    {
	    for(i=0;i<l1;i++)
	    {
	        if(str1[i]!=str2[i])
	        {
	        value=0;
	        break;
	        }
	    }
	    if(value==1)
	    {
	        System.out.println("Both strings are Equal");
	    }
	    }
	    else
	    {
	        System.out.println("Both strings are not Equal");
	    }
	}
}
