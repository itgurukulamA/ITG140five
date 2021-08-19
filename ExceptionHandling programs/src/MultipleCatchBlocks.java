
public class MultipleCatchBlocks {

	public static void main(String[] args) {
			try{
			int a[]=new int[7];
			a[4]=30/0;
			}
			catch(ArithmeticException e){
			System.out.println("We cannot divide a number by zero");
			}
			catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Arrayoutofboundexception occurs");
			}
			System.out.println("Exception was handling and we are out of try and catch blocks");
			
	}

}
