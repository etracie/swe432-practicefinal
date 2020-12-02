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
public class PracticeExam extends HttpServlet // Inheriting from HttpServlet makes this a servlet
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
		out.println("<link rel='stylesheet' href='./432-style.css' type='text/css'>");
                out.println("<style>");
                out.println("button { border: 3px solid rgb(23,53,95); border-radius: 8px; padding: 10px; background-color: rgb(193,231,247); font-size: 20px; }");
                out.println("div { background-color: rgb(235,197,0); color: rgb(23,53,95); padding: 20px; border: 3px solid rgb(23,53,95); }");
                out.println("</style>");
		out.println("</head>");		
		out.println("<body style='background-color: rgb(54,94,120);'>");
                out.println("<h1 align='center' style='padding:20px; font-size:40px; color: rgb(235,197,0);'>Beth's Practice Exam</h1>")'
                out.println("<div align='center'>");
                out.println("<h2 align='center' style='font-size: 30px;'>Your Favorite Book Titles:</h2>");
                out.println("<form> <input type='text' id='book1' name='book1'><br>");
                out.println("<input type='text' id='book2' name='book2'><br>");
                out.println("<input type='text' id='book3' name='book3'><br>");
                out.println("<br><button type='submit'>Submit</button>");
                out.println("</form>");
                out.println("</div>");

		out.println("</body>");
		out.println("</html>");

		out.close();
	}  // end doGet()


}  // end 
