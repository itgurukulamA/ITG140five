import java.util.Scanner;

public class RemoveCommon {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str3="";
		System.out.println("Enter a string to remove common char");
		String str=sc.next();
		System.out.println("Enter string2");
		String str2=sc.next();
		for (int i = 0; i <str.length(); i++) {
		            for (int j = 0; j <str2.length(); j++) {
		                if (str.charAt(i) == str2.charAt(j) ){
		                   
		                    str3+=str.charAt(i);

		                }

		            }
		        }
		for(int i=0;i<str3.length();i++)
		{
		String removechar = str3.charAt(i)+"";
		str=str.replace(removechar,"");
		str2=str2.replace(removechar,"");
		}
		System.out.println(str);
		System.out.println(str2);

		

	}

}
