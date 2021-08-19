
public class NumberFormatException1{

	public static void main(String[] args) {
		try {
			int num=Integer.parseInt("Swethak");
			System.out.println(num);
		}

		catch(NumberFormatException e) {
			System.out.println("number format exception");
			
		}
	}

}
