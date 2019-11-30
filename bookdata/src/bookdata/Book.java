package bookdata;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class Book extends GenericServlet implements Servlet {

	public void service(ServletRequest request, ServletResponse response) throws ServletException,IOException{
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String bcode=request.getParameter("code");
		String bname=request.getParameter("name");
		String bauthor=request.getParameter("author");
		int bprice=Integer.parseInt(request.getParameter("price"));
		
		pw.println("<br>Book Code:"+bcode);
		pw.println("<br>Book Name:"+bname);
		pw.println("<br>Book Author:"+bauthor);
		pw.println("<br>Book Price:"+bprice);
		
		}
		}



