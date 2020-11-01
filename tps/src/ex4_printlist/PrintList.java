package ex4_printlist;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrintList
 */
@WebServlet("/PrintList")
public class PrintList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrintList() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ArrayList<String> objets = new ArrayList<String>();
			objets.add("Chaise");
			objets.add("Stylo");
			objets.add("Cheescake");
			objets.add("Voiture");
			
			RequestDispatcher resquetDistpatcher = request.getRequestDispatcher("ex4PrintList.jsp");
			request.setAttribute("list", objets);
			resquetDistpatcher.forward(request, response);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
