package test;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
public class BRetrieve extends GenericServlet {
	public void service(ServletRequest req,ServletResponse res)
	throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String bCode=req.getParameter("code");
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("select * from book9 where bcode=?");
			ps.setString(1, bCode);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				pw.println("<br>Book Name:"+rs.getString(2));
				pw.println("<br>Book Author:"+rs.getString(3));
				pw.println("<br>Book Price:"+rs.getFloat(4));
			}//end of if
			else
			{
				pw.println("invalid book code");
			}

		}//end of try
		catch(Exception e) {}
		
	}

}
