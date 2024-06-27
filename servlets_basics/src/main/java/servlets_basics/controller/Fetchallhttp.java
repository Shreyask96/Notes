package servlets_basics.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlets_basics.dao.EmployeeDao;
import servlets_basics.dto.Employee;

@WebServlet("/fetchall")
public class Fetchallhttp extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EmployeeDao dao=new EmployeeDao();	
		List<Employee> list=dao.fetchall();
		resp.getWriter().print(list);
		
		
		req.setAttribute("objects", list);              //to get in table format.
		
		RequestDispatcher rd=req.getRequestDispatcher("download.jsp");
		rd.forward(req, resp);
	}

}
