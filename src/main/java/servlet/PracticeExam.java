// Import Servlet Libraries
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

// Import Java Libraries
import java.io.*;
import java.util.*;
import java.lang.*;

import java.util.ArrayList;

// The @WebServletannotation is used to declare a servlet
@WebServlet(name = "Practice Exam", urlPatterns = {"/PracticeExam"}) 
public class Logic extends HttpServlet // Inheriting from HttpServlet makes this a servlet
{

	static String Domain = "cs.gmu.edu:8443";
	static String Path = "swe432-assign5-ntb.herokuapp.com/PracExam";
	static String Servlet = "Practice Exam";


	public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html"); // Tells the web container what we're sending back
                PrintWriter out = response.getWriter(); // Make it appear as if we're "writing" to the browser window
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Logic Predicate Servlet</title>");
		out.println("</head>");
		
		out.println("<style>");
		out.println("body { background-color: #D1F2EB; font-family: sans-serif; }");
		out.println("</body>");
		out.println("</html>");

		out.close();
	}  // end doGet()


}  // end 
