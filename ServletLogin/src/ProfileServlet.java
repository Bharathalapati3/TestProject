

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProfileServlet
 */
@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
   {
	 res.setContentType("text/html"); 
	 PrintWriter pw =res.getWriter();
	 req.getRequestDispatcher("index.html").include(req, res);  
	 Cookie ck[] = req.getCookies();
	 if(ck!= null)
	 {
		String name = ck[0].getValue();
		if(!name.equals("")||name!=null)
		{
		    pw.print("<br/>");
			pw.println("<b>Welcome to the profile</b><br/>");
			pw.println("Welcome " +name);
		}}
	 else {
		 pw.println("<br/>");
		 pw.println("<b>Please Login First</b>");
		 req.getRequestDispatcher("Login.html").include(req, res);
		 
	 }
		
	 pw.close();
	 
   }
		 
		 
	 }
	 
	   
