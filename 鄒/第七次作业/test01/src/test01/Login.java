package test01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        ServletOutputStream println = response.getOutputStream();
        println.write((username+"-iteduqq").getBytes("utf-8"));
        String password = request.getParameter("password");
        ServletOutputStream print = response.getOutputStream();
        print.write((password+"-iteduqq").getBytes("utf-8"));
    }
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String username = request.getParameter("username");
	    ServletOutputStream println = response.getOutputStream();
	    println.write((username+"-iteduqq").getBytes("utf-8"));
	    String password = request.getParameter("password");
	    ServletOutputStream print = response.getOutputStream();
	    print.write((password+"-iteduqq").getBytes("utf-8"));
	}
}