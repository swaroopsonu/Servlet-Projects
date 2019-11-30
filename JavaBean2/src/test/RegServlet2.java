package test;
import java.io.*;
import javax.servlet.*;

public class RegServlet2 extends GenericServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		ServletContext sct=req.getServletContext();
		RegData rd=(RegData)sct.getAttribute("bref");
		String addr=req.getParameter("addr");
		long phNo=Long.parseLong(req.getParameter("phNo"));
		String mailId=req.getParameter("mailId");
		try {
	    rd.setAddr(addr);
	    rd.setPhNo(phNo);
		rd.setMailId(mailId);
		sct.setAttribute("uRef",rd);
		RequestDispatcher rd2=req.getRequestDispatcher("reg3");
		
		
		rd2.forward(req, res);
		}catch (ServletException e){
			e.printStackTrace();
		}
		}
	}

