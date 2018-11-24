package jdbc;
import java.sql.*;

public class Simple {
	public static void main(String[] args) throws SQLException
	{
		
	try {
		//Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practical","root","root");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from emp_info");
		rs.absolute(1);
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getInt(5));
		
		while(rs.next())
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getInt(5));
		
		con.close();
		
		
	} catch(Exception e){ System.out.println(e);}
	
		}

}
