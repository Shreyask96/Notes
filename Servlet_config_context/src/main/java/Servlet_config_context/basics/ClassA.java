package Servlet_config_context.basics;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insert")
public class ClassA extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		System.out.println("File Found");
		
		//int a=1/0;
		
		
		System.out.println(getServletContext().getInitParameter("kfc"));
		
		System.out.println(getServletConfig().getInitParameter("mcd"));
	}

}
