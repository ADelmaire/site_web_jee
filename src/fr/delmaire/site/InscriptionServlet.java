package fr.delmaire.site;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InscriptionServlet
 */
public class InscriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InscriptionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/inscription.jsp")
		.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String civiliteString = request.getParameter("civilite");
		Integer civilite = Integer.parseInt(civiliteString);
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String date = request.getParameter("date_naissance");
		String numrue = request.getParameter("numero_rue");
		String ville = request.getParameter("ville");
		String dep = request.getParameter("departement");
		String pays = request.getParameter("pays");
		String tel = request.getParameter("telephone");
		String email = request.getParameter("email");
		String comment = request.getParameter("commentaires");
		
		request.setAttribute("civilite", civilite);
		request.setAttribute("nom", nom);
		request.setAttribute("prenom", prenom);
		request.setAttribute("date", date);
		request.setAttribute("numrue", numrue);
		request.setAttribute("ville", ville);
		request.setAttribute("dep", dep);
		request.setAttribute("pays", pays);
		request.setAttribute("tel", tel);
		request.setAttribute("email", email);
		request.setAttribute("comment", comment);
		
		if (nom.equals("")) {
			this.getServletContext()
			.getRequestDispatcher("/WEB-INF/pages/inscription.jsp")
			.forward (request, response);
		} else {
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/inscription-ok.jsp")
		.forward (request, response);
		}
		
	}

}
