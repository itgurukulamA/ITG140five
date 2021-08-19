
public class TryCatchExample1 {

	public static void main(String[] args) {
		try {
		int data=50/0;
		}
		catch(ArithmeticException e) {
			System.out.println("A Number cannot be divided by zero");
			
		}
	}

}
