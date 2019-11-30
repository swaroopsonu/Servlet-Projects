package test;
import java.io.*;
import javax.servlet.*;
public class RegServlet1 extends GenericServlet  {

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		RegData rd=new RegData();
		String uName=req.getParameter("uName");
		String pWord=req.getParameter("pWord");
		String fName=req.getParameter("fName");
	    String lName=req.getParameter("lName");
	    rd.setuName(uName);
	    rd.setpWord(pWord);
		rd.setfName(fName);
		rd.setlName(lName);
		ServletContext sct=req.getServletContext();
		sct.setAttribute("bRef",rd);
		RequestDispatcher rd1=req.getRequestDispatcher("input2.html");
		rd1.forward(req, res);
	}

}
