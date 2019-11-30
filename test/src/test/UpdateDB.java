package test;
import java.util.*;
import java.sql.*;
public class UpdateDB {

public static void main(String[] args) throws ClassNotFoundException,SQLException {
	 	Scanner s=new Scanner(System.in);
		System.out.println("enter uName");
		String uName= s.nextLine();
		System.out.println("enter the pword");
		String pword=s.nextLine();
		System.out.println("enter the fname ");
		String fname= s.nextLine();
		System.out.println("enter the lname");
		String lname=s.nextLine();
		System.out.println("enter the address");
		String addr= s.nextLine();
		System.out.println("enter the mail id");
		String mailid=s.nextLine();
		System.out.println("enter the phone number");
		String phno=s.nextLine();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","19143");
		PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?,?,?)");
		ps.setString(1,uName);
		ps.setString(2,pword);
		ps.setString(3,fname);		
		ps.setString(4,lname);
		ps.setString(5,addr);
		ps.setString(6,mailid);
		ps.setString(7,phno);
		int k= ps.executeUpdate();
		if(k==1)
			{
			 System.out.println("user registered succesfully");
			}
		 con.close();
			}
				
	}


