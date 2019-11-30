package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CalServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String pCode=req.getParameter("pCode");
		String pName=req.getParameter("pName");
		Float pPrice=Float.parseFloat(req.getParameter("pPrice"));
		int pQty=Integer.parseInt(req.getParameter("pQty"));
		float billAmt=pPrice*pQty;
		float fAmt=billAmt;
		if(billAmt>5000)
		{
			res.sendRedirect("http://localhost:8082/WebApp2/dis?bAmt="+billAmt+"&fAmt="+fAmt+"&pCode="+pCode+"&pName="+pName);
		}//end of if
		else
		{
			pw.println("---------final bill amt---------");
			pw.println("<br>Product Code: "+pCode);
			pw.println("<br>Product Name: "+pName);
			pw.println("<br>Bill Amt : "+billAmt);
			pw.println("<br>Final Bill: "+fAmt);
		}
	}

}
