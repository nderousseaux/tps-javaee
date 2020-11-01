package ex3_login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginMultiPagePost
 */
@WebServlet("/LoginMultiPagePost")
public class LoginMultiPagePost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginMultiPagePost() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String login = request.getParameter("login");
			String password = request.getParameter("password");
			String message;
			if (login.equals("aaa") && password.equals("aaa")) {
				message = "Hello " + login;
			}
			else {
				message = "Erreur";
			}
			response.setContentType("text/html");
			PrintWriter writer = response.getWriter();
			writer.println("<html>");
			writer.println("<head><title>Exo3_2bis</title></head>");
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
