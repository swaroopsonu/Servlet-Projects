package test;
import java.util.*;
import java.sql.*;
public class train {
public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","19143");
			Statement st= con.createStatement();
			Scanner s= new Scanner(System.in);
			System.out.println("enter TRAIN number:");
			int tr=s.nextInt();
			
			ResultSet rs=st.executeQuery("select *from train where tno="+tr);
		
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
		    }

			con.close();	
			}catch (Exception e)
		{
				System.out.println(e);//
		}
	}


}
