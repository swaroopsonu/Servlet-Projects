package assign2;
import java.util.*;
import java.sql.*;
public class delete_product {

	public static void main(String[] args) {
		try {
			Scanner s= new Scanner(System.in);
			System.out.println("Enter the pcode");
			String pcode=s.nextLine();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","19143");
			PreparedStatement ps= con.prepareStatement("Select * from product where pcode=?");
			ps.setString(1, pcode);
			ResultSet rs= ps.executeQuery();
			if (rs.next())
			{
				PreparedStatement ps1= con.prepareStatement("delete from product where pcode=?");
				ps1.setString(1,pcode);
				int k= ps1.executeUpdate();
				if(k==1)
				{
					System.out.println("----record deleted---");
				}
			}//end of if
			else
			{
				System.out.println("invalid pcode");
			}
			con.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
