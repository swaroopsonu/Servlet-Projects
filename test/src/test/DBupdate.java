package test;
import java.util.*;
import java.sql.*;

public class DBupdate {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
					Scanner s= new Scanner(System.in);
			System.out.println("enter the uname");
			String uname =s.nextLine();
			System.out.println("enter the pword");
			String pword=s.nextLine();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","19143");
			PreparedStatement ps1= con.prepareStatement("Select * from data where uname=? and pword=?");
			ps1.setString(1,uname);
			ps1.setString(2,pword);
			ResultSet rs=ps1.executeQuery();
			if(rs.next())
			{
				PreparedStatement ps2= con.prepareStatement("update data set addr=? where uname=? and pword=?");
			
			System.out.println("Enter the new address to be updated");
			String addr= s.nextLine();
			ps2.setString(1,addr);
			ps2.setString(2,uname);
			ps2.setString(3,pword);
			int k= ps2.executeUpdate();
			if(k==1)
			{
				System.out.println("Address updated");
			}
			}//end of if
			else
			System.out .println("invalid username or pword");
			
		 con.close();
		}
		}
	


