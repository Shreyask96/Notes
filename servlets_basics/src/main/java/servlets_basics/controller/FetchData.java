package servlets_basics.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import servlets_basics.dao.EmployeeDao;
import servlets_basics.dto.Employee;

@WebServlet("/jkl")
public class FetchData extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String eid=req.getParameter("primarykey");
		int cid=Integer.parseInt(eid);
		
		EmployeeDao dao=new EmployeeDao();
		Object e=dao.fetch(cid);
		
		res.getWriter().print(e);   // << to send back to frontend (browser).
		
		
	}

}
