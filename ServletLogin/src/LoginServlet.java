

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
{
	res.setContentType("text/html");
	PrintWriter pw = res.getWriter();
	
	String u = req.getParameter("username");
	String p = req.getParameter("password");
	
	req.getRequestDispatcher("index.html").include(req, res);  
	
	if(p.equals("bharath"))
	{
	pw.println("successfully logged in");
	pw.println("<br>Welcome" +u);
	
	Cookie ck = new Cookie("name",u);
	res.addCookie(ck);
	}
	else
	{
		pw.println("Password not matching with the user name");
		RequestDispatcher rd = req.getRequestDispatcher("Login.html");
		rd.include(req,res);
	}
	
	pw.close();
		
	}
	
	
	
}