package test;
import java.io.*;
import javax.servlet.*;
import java.sql.*;
public class BookServlet extends GenericServlet {
	public void init() 
	throws ServletException{}
	public void service(ServletRequest req,ServletResponse res)
	{
		try {
			PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String bCode=req.getParameter("code");
		String bName=req.getParameter("name");
		String bAuthor=req.getParameter("author");
		int bPrice=Integer.parseInt(req.getParameter("price"));
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","19143");
			PreparedStatement ps= con.prepareStatement("insert into book9 values(?,?,?,?)");
			ps.setString(1,bCode);
			ps.setString(2,bName);
			ps.setString(3,bAuthor);
			ps.setInt(4,bPrice);
			int k=ps.executeUpdate();
			if(k==1)
			{
				pw.println("Record Updated");
			}//end of if
			else
			{
				pw.println("Record not Updated");
			}
			
			
		}//end of try
		catch(Exception e) {}
		
	}
	public void destroy() {}
	}


