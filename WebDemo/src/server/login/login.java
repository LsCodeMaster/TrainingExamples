package server.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class login
 */
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("uName");
		String password = request.getParameter("uPass");
		
		if(userName.equalsIgnoreCase("Ian") && password.equals("password")){
			HttpSession session = request.getSession(true);
			session.setAttribute("name", userName);
			session.setAttribute("pass", password);
			Cookie chocolateChip = new Cookie("type", "Chocolate Chip");
			session.setMaxInactiveInterval(10);
			request.getRequestDispatcher("/welcome.jsp").forward(request, response);
		}
		else{
			response.sendRedirect("html/static/loginTimeout.html");
		}
	}

}
