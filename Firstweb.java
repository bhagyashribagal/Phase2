package webserver;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Firstweb")
public class Firstweb extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Hi...server initialised");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
//set the contant type of the responce
		System.out.println("Do get..");
		response.setContentType("Text/HTML");
		//Get a refrance to print writer
	PrintWriter out =response.getWriter();
	//Lets write something
	out.println("<html>");
	out.println("<body>");
	out.println("Server is running");
	out.println("<h3> server is:" +request.getContextPath() + "</h3>");
	out.println("</body>");
	out.println("</html>");
	}
}
