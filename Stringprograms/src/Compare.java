import java.util.Scanner;

public class Compare {
	
		public static void main(String[] args)
		{
		     int i,value=1,len1,len2;
		String s1,s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st string");
		s1=sc.nextLine();
		System.out.println("Enter the 2nd string");
		s2=sc.nextLine();
		 
		len1=s1.length();
		len2=s2.length();
		 
		char str1[] = s1.toCharArray();
		char str2[] = s2.toCharArray();
		 
		    	    	if(len1==len2)
		     { 
		     for(i=0;i<len1;i++)
		     {
		         if(str1[i]!=str2[i])
		         {
		             value=0;
		                  break;
		}
		         }
		}
		
		     	if(value==1)
		     {
		         	System.out.println("The two string are EQUAL");
		         System.out.println(s1+" = "+s2);
		     }
		 
		     else
		     {
		         	System.out.println("The two string are NOT EQUAL");
		         System.out.println(s1+" != "+s2);
		     }
		}
		

}