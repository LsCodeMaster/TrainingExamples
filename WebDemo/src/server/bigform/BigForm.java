package server.bigform;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BigForm
 */
public class BigForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String firstContext;
	private String initParam;
	private Date time;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BigForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
    	// TODO Auto-generated method stub
    	super.init(config);
    	firstContext =  config.getServletContext().getInitParameter("firstContext");
    	initParam = config.getInitParameter("initParam");
		Calendar cal = Calendar.getInstance();
		time = cal.getTime();
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Enumeration<String> names = request.getParameterNames();
		PrintWriter out = response.getWriter();
		while(names.hasMoreElements()){
			out.print("<p>");
			String val = names.nextElement();
			out.print(val+ " : " + request.getParameter(val));
			out.println("<p>");
		}
		out.println("<p>" + firstContext + "</p>");
		out.println("<p>" + initParam + "</p>");
		Calendar cal = Calendar.getInstance();
		out.println("<p>Time one: " + time + "</p>");
		out.println("<p>Time two: " + new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(cal.getTime()) + "</p>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
