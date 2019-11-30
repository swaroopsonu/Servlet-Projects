package test;
import java.util.*;
import java.io.*;
import javax.servlet.*;
public class DisServlet extends GenericServlet{

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw= res.getWriter();
		res.setContentType("text/html");
		ArrayList ref=(ArrayList)req.getAttribute("ref");
		Iterator it=ref.iterator();
		it.forEachRemaining((k)->
		{
			ProductData pd=(ProductData)k;
			pw.println("<br>"+pd.getCode()+"&nbsp"+pd.getName()+"&nbsp"+pd.getQty());
		});
		
	}

	
}
