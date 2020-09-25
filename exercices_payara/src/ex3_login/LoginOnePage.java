package ex3_login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Exo3
 */
@WebServlet("/LoginOnePage")
public class LoginOnePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginOnePage() {
        super();
        // TODO Auto-generated constructor stub
    }

    // URL : http://localhost:8080/exercices_payara/LoginOnePage
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//writer.println("");
			response.setContentType("text/html");
			PrintWriter writer = response.getWriter();
			writer.println("<html>");
			writer.println("<head><title>LoginOnePage</title></head>");
			writer.println("<body>");
			writer.println("<form action='LoginOnePage' method='post'>");
			writer.println("<label for='login'>Login :</label>");
			writer.println("<input type='text' id='login' name='login'>");
			writer.println("<label for='password'>Password :</label>");
			writer.println("<input type='text' id='password' name='password'>");
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
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String login = request.getParameter("login");
			String message;
			if (login.equals("aaa")) {
				message = "Hello " + login;
			}
			else {
				message = "Erreur";
			}
			response.setContentType("text/html");
			PrintWriter writer = response.getWriter();
			writer.println("<html>");
			writer.println("<head><title>Exo3</title></head>");
			writer.println("<body>");
			writer.println(message);
			writer.println("</body>");
			writer.println("</html>");
			writer.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
