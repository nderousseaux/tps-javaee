package ex2_list;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class List
 */
@WebServlet("/List")
public class List extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public List() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//writer.println("");
			response.setContentType("text/html");
			PrintWriter writer = response.getWriter();
			writer.println("<html>");
			writer.println("<head><title>List</title></head>");
			writer.println("<body>");
			writer.println("<form action='List' method='post'>");
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
			//writer.println("");
			response.setContentType("text/html");
			PrintWriter writer = response.getWriter();
			writer.println("<html>");
			writer.println("<head><title>List</title></head>");
			writer.println("<body>");
			writer.println("<form>");
			writer.println("<select name='objets' size=1>");
			writer.println("<option> Chaise");
			writer.println("<option> Stylo");
			writer.println("<option> Cheescake");
			writer.println("<option> Voiture");
			writer.println("</select>");
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
