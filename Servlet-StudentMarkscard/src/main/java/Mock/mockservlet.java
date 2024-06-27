package Mock;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/multi")
public class mockservlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String num1=req.getParameter("num1");
		String num2=req.getParameter("num2");
		int cnum1=Integer.parseInt(num1);
		int cnum2=Integer.parseInt(num2);
		
		int multi;
		
	    for (int i = 1; i <=cnum2; i++) {
	    	multi=cnum1*i;
	    	resp.getWriter().print(cnum1 +"*"+ i+"="+ multi+ " ");
		}
		
	}

}
