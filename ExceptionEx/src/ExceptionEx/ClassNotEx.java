package ExceptionEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ClassNotEx {
public static void main(String args[]) throws Exception
{
	try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sriram","root","admin123");
	Statement st=con.createStatement();
	st.executeUpdate("insert into student values(8,'laxman',43567)");
	}catch(ClassNotFoundException e)
	{
		System.out.println(e);
	}
}
}
