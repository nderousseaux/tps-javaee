package index;


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
@WebServlet("/index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Index() {
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
	
			writer.println("<p>APi fonctionnelle, sans l'authentif. On arrive pas à mettre en place la transaction pour la création d'un user.</p>");
			
			writer.println("<ul>");
			writer.println("	<li><a href=\"http://cdad157.iutrs.unistra.fr:8080/api/api/vols/\">GETALL</a></li>");
			writer.println("	<li><a href=\"http://cdad157.iutrs.unistra.fr:8080/api/api/vols/numVol-IDTROPCOOL\">GET by id</a></li>");
			writer.println("	<li><a href=\"http://cdad157.iutrs.unistra.fr:8080/api/api/vols/search?departureTime=349809342\">GET by params</a></li>");
			writer.println("     <li><a href=\"http://cdad157.iutrs.unistra.fr:8080/tps/getpost\">Exercice 1</a></li>");
			writer.println("      <li><a href=\"http://cdad157.iutrs.unistra.fr:8080/tps/List\">Exercice 2</a></li>");
			writer.println("      <li><a href=\"http://cdad157.iutrs.unistra.fr:8080/tps/LoginOnePage\">Exercice 3</a></li>");
			writer.println("</ul>");
			writer.println("</body>");
			writer.println("</html>");
			writer.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
