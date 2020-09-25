package ex3_login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginMultiPageGet
 */
@WebServlet("/LoginMultiPageGet")
public class LoginMultiPageGet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginMultiPageGet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//writer.println("");
			response.setContentType("text/html");
			PrintWriter writer = response.getWriter();
			writer.println("<html>");
			writer.println("<head><title>LoginMultiPageGet</title></head>");
			writer.println("<body>");
			writer.println("<form action='LoginMultiPagePost' method='post'>");
			writer.println("<label for='login'>Login :</label>");
			writer.println("<input type='text' id='login' name='login'>");
			writer.println("<label for='password'>Password :</label>");
			writer.println("<input type='password' id='password' name='password'>");
			writer.println("<button type='submit'>Go</button>");
			writer.println("</form>");
			writer.println("</body>");
			writer.println("</html>");
			writer.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
