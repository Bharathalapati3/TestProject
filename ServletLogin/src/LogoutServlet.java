

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
	 res.setContentType("text/html");
	 PrintWriter pw = res.getWriter();
	 
	 req.getRequestDispatcher("Login.html").include(req, res);
	 
	 Cookie ck = new Cookie("name","");
	 ck.setMaxAge(0);
	 res.addCookie(ck);
	 pw.print("successfully Logged out");
	 
	 pw.close();
	 
	}
}
