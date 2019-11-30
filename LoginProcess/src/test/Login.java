package test;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
public class Login extends GenericServlet {
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException 
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String uname=req.getParameter("uname");
		String pword=req.getParameter("pword");
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("select *from reg where uname=? and pword=?");
			ps.setString(1,uname);
			ps.setString(2,pword);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
			    pw.println("<br>First Name:"+rs.getString(3));
				pw.println("<br>Last Name:"+rs.getString(4));
				pw.println("<br>Address:"+rs.getString(5));
				pw.println("<br>Phone no.:"+rs.getString(6));
				pw.println("<br>Mail_id:"+rs.getString(7));
			}//end of if
			
		}//end of try
		catch(Exception e) {
						
		}
		
	
	}
	
}
