

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletRequest
 */
@WebServlet("/Welcome")
public class ServletRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doGet(HttpServletRequest req,HttpServletResponse res)  
			throws ServletException,IOException  
			{  
			//res.setContentType("text/html");  
			PrintWriter pw=res.getWriter();  
			  
			String name=req.getParameter("name");//will return value  
			//pw.println("Welcome "+name);  
			  
			if(name.equals("Bharath")) {
			RequestDispatcher rs=req.getRequestDispatcher("index1.html");
			rs.forward(req, res);
			}
			
			else {
				pw.println("Enter Correct User Name");
				RequestDispatcher rs=req.getRequestDispatcher("index.html");
				rs.include(req, res);	
			
				
				}
			pw.close();
			
				
						}} 

