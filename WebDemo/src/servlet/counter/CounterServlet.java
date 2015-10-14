package servlet.counter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CounterServlet
 */
public class CounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int counter = 0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CounterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		Enumeration<String> list = request.getHeaderNames();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>"+(++counter)+"</h1>");
		while(list.hasMoreElements()){
			out.print("<p>");
			String elem = list.nextElement();
			out.print("header " + elem + ": " + request.getHeader(elem));
			out.println("</p>");
		}
		
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
