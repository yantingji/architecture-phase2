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
			    + "��¼" 
				+ "</title>" 
			    + "</title>" 
				+ "</head>" 
			    + "<body>"
				+ "<form action=\"http://localhost:8080/text01/login\" method=\"post\">"
				+ "<p>�û�����<input type=\"text\" name=\"username\"></p>"
				+ "<p>��&nbsp;�룺<input type=\"password\" name=\"password\" ></p>"
				+ "<p><input type=\"submit\" value=\"��¼\"></p>" 
				+ "</form>" 
				+ "</body>" 
				+ "</html>";
		
		ServletOutputStream so = response.getOutputStream();
		so.write(html.getBytes("utf-8"));

		// ��ȡ����Э��(http(hyper text transform protocal)�����ı�����Э��) 
		String schema =request.getScheme(); 
		System.out.println("request.getScheme()=" + schema); //��ȡ�˿ں�
		int port = request.getServerPort();
		System.out.println("request.getServerPort()=" + port); // ��ȡ���������� 
		String	serverName = request.getServerName();
		System.out.println("request.getServerName()=" + serverName); // ��ȡ������		
		String context = request.getContextPath();
		System.out.println("request.getContextPath()=" + context); //	http://localhost:8888/ 
		String path = schema + "://" + serverName + ":" + port+ context; 
		System.out.println(path);// ��׳��
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		super.doPost(req, resp);
	}
}