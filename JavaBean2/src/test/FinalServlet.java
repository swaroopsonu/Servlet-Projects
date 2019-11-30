package test;
import java.io.*;
import java.sql.*;
import javax.servlet.*;

public class FinalServlet extends GenericServlet {

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		RegData rd=(RegData)req.getAttribute("uref");
		try {
			Connection con=DBConnection .getCon();
			PreparedStatement ps=con.prepareStatement("insert into reg values(?,?,?,?,?,?,?)");
			ps.setString(1, rd.getuName());
			ps.setString(2, rd.getpWord());
	     	ps.setString(3, rd.getfName());
			ps.setString(4, rd.getlName());
			ps.setString(5, rd.getAddr());
			ps.setLong(6, rd.getPhNo());
			ps.setString(7, rd.getMailId());
			int k=ps.executeUpdate();
			if(k==1)
			{
				pw.println("USER REGISTRATION SUCCESFULLY");
			}//end of if
			else
			{
				pw.println("USER NOT REGISTER");
			}
		}//end of try
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
