import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Simple
 */
@WebServlet("/Simple")
public class Simple extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req,HttpServletResponse res)  
			throws ServletException,IOException  
			{  
			res.setContentType("text/html"); 
			PrintWriter pw=res.getWriter();
			  
			//writing html in the stream  
			pw.println("<html><body>");  
			pw.println("Welcome to servlet");  
			pw.println("</body></html>");  
			  
			pw.close();//closing the stream  
			}}  