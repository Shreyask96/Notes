package Servlets_Sessiontracking.cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/homepage")
public class Homepage extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
//		String s1=req.getParameter("mail");
		
		Cookie[] cookie=req.getCookies();
		
		for(Cookie c:cookie)
		{
			String email=c.getValue();
//			String password=c.getValue();
			
			resp.getWriter().print("Hi" + " "+ email);
//			resp.getWriter().print("Hello"+ " "+ password);
			break;
		}
		
		
		

		
//		resp.getWriter().print("Hello" + " " + s1);
	}

}
