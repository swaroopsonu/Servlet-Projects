package test;
import java.sql.*;
public class DBconnectivity {

	public static void main(String[] args) 
	{
	
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","19143");
		Statement st= con.createStatement();
		ResultSet rs=st.executeQuery("select *from employee");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
		}
		con.close();
	
		}catch (Exception e)
		{
			System.out.println(e);
		}
	}
	}
