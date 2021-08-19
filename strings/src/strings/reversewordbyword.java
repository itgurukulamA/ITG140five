package strings;

import java.util.Scanner;

public class reversewordbyword {

	public static void main(String args[]) {
		String str;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string to reverse:");
		str = sc.nextLine();
		String str2=new String();
		String str1[] = str.split(" ");
		for (int i = 0; i < str1.length; i++) {
			String s1 = str1[i];
			int length = s1.length();
			for (int j = length - 1; j >= 0; j--)
			{
				System.out.print(s1.charAt(j));
			}
			System.out.print(" ");
		}
	}
}
