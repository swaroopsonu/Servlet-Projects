package test;
import java.io.*;

import java.sql.*;
import java.util.*;

import javax.servlet.*;
public class BeanServlet extends GenericServlet {

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		ArrayList<ProductData> a1=new ArrayList<ProductData>();
		PrintWriter pw= res.getWriter();
		res.setContentType("text/html");
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from products");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				ProductData pd =new ProductData();
				pd.setCode(rs.getString(1));
				pd.setName(rs.getString(2));
				pd.setQty(rs.getInt(3));
				a1.add(pd);
			}
			req.setAttribute("ref",a1);//setting attribute
			RequestDispatcher rd=req.getRequestDispatcher("dis");
			rd.forward(req, res);
		}//end of try
		catch(Exception e) {}
	}

}
