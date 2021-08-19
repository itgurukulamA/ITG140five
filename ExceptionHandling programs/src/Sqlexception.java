import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sqlexception {

	public static void main(String[] args) throws ClassNotFoundException{
		{
			try
			{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/swethak","root","admin123");
			java.sql.PreparedStatement pst=con.prepareStatement("insert into student values(?,?,?)");
			pst.setInt(1,8);
			pst.setString(2,"laxman");
			pst.setInt(3,34765);
			int i=pst.executeUpdate();
			if(i>0)
			{
			System.out.println("data inserted successfully");
			}
			else
			{
			System.out.println("data inserted failed");
			}
			}catch(SQLException e)
			{
			System.out.println(e);
			}
			}
			}

	}


