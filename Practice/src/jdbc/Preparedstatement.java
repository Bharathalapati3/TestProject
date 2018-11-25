package jdbc;
import java.sql.*;

public class Preparedstatement {
	public static void main(String args[]) throws SQLException {
		
		try {
			
			//Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practical","root","root");
		
			PreparedStatement stmt = con.prepareStatement("insert into emp_info values(?,?,?,?,?)");
			
		stmt.setInt(1, 3);
		stmt.setString(2, "Vikram");
		stmt.setString(3, "Kumar");
		stmt.setString(4, "vikramkumar@gmail.com");
		stmt.setInt(5, 987456984);
		
		int result = stmt.executeUpdate();
		System.out.println(result+" rows updated");
		
		Statement stmt1 = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("Select * from emp_info");
		while(rs.next())   
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getInt(5));
				
		}catch(Exception e){ System.out.println(e);}
		
			
	}

}
