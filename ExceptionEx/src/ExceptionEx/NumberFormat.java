package ExceptionEx;

public class NumberFormat {

	public static void main(String[] args) {
		try {
		String s="laxman";
		int n=Integer.parseInt(s);
		System.out.println(n);
		}catch(NumberFormatException e)
		{
			System.out.println(e);
		}
	}

}