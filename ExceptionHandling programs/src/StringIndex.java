
public class StringIndex {

	public static void main(String[] args) {
			try
			{
			String s="hello good Morning every one";
			System.out.println(s.length());
			System.out.println(s.substring(29));
			try
			{
			System.out.println(s.charAt(6));
			}
			catch(Exception e)
			{
			System.out.println(e);
			}
			}catch(StringIndexOutOfBoundsException e)
			{
			System.out.println(e);
			}
			
	}

}
