package servlets_rdi_sdam.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/class1")
public class Demo extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String s=req.getParameter("id");
		int cid=Integer.parseInt(s);		
		System.out.println(cid);
		
//		res.getWriter().print("<a href="class2\">clickhere</a>");
		
		System.out.println("Recevied in class1");
		
		RequestDispatcher rd=req.getRequestDispatcher("class2");
		rd.forward(req, res);
		
	}

}
	