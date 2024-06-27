package servlets_rdi_sdam.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/class2")
public class Sample extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		
		String s1=req.getParameter("id");
		int cid1=Integer.parseInt(s1);
		System.out.println(cid1);
		
		System.out.println("Received in class2");
		
	}

}
