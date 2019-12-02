package test01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sevelet extends HttpServlet{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
	    String urlStr = request.getRequestURI();
	    if("/test01/wellcome".equals(urlStr)) {
	       // TODO 处理
	        request.getRequestDispatcher("/test01/Login.java").forward(request, response);
	    }else if("".equals(urlStr)) {
	    	request.getRequestDispatcher("/test01/Welcome.java").forward(request, response);
	    }
    }
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {	    	
	    String urlStr = request.getRequestURI();
	    if("/test01/wellcome".equals(urlStr)) {
	    	// TODO 处理
	    	request.getRequestDispatcher("/test01/Login.java").forward(request, response);	    		
	    }else if("".equals(urlStr)) {
	    	request.getRequestDispatcher("/test01/Welcome.java").forward(request, response);
	    }	       
	}		       
}