package test;
import java.sql.*;
public class DBConnection {
	public static Connection con;

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","19143");
		
	}//end of try
		catch(Exception e)
		{}
	}//end of static block
	public static Connection getCon()
	{
		return con;
	}

}