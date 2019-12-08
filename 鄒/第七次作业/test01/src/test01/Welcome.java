package test01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String html = "<html>" 
			    + "<head>" 
				+ "<title>" 
			    + "登录" 
				+ "</title>" 
			    + "</title>" 
				+ "</head>" 
			    + "<body>"
				+ "<form action=\"http://localhost:8080/text01/login\" method=\"post\">"
				+ "<p>用户名：<input type=\"text\" name=\"username\"></p>"
				+ "<p>密&nbsp;码：<input type=\"password\" name=\"password\" ></p>"
				+ "<p><input type=\"submit\" value=\"登录\"></p>" 
				+ "</form>" 
				+ "</body>" 
				+ "</html>";
		
		ServletOutputStream so = response.getOutputStream();
		so.write(html.getBytes("utf-8"));

		// 获取访问协议(http(hyper text transform protocal)：超文本传输协议) 
		String schema =request.getScheme(); 
		System.out.println("request.getScheme()=" + schema); //获取端口号
		int port = request.getServerPort();
		System.out.println("request.getServerPort()=" + port); // 获取服务器名字 
		String	serverName = request.getServerName();
		System.out.println("request.getServerName()=" + serverName); // 获取工程名		
		String context = request.getContextPath();
		System.out.println("request.getContextPath()=" + context); //	http://localhost:8888/ 
		String path = schema + "://" + serverName + ":" + port+ context; 
		System.out.println(path);// 健壮性
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		super.doPost(req, resp);
	}
}