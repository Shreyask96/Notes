package servlets_basics.controller;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import servlets_basics.dao.EmployeeDao;
import servlets_basics.dto.Employee;

@WebServlet("/abc")
public class insert implements Servlet {

	@Override
	public void init(ServletConfig config) throws ServletException {

	}

	@Override
	public ServletConfig getServletConfig() {

		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// System.out.println("Welcome to Servlet class");

		String eid = req.getParameter("id");
		String ename = req.getParameter("name");
		String epassword = req.getParameter("pwd");
		String egender = req.getParameter("gender");
		String empmail = req.getParameter("mail");
		String Dob = req.getParameter("dob");
		String Terms = req.getParameter("checkbox");
		String Country = req.getParameter("country");

		System.out.println(eid);
		System.out.println(ename);
		System.out.println(epassword);
		System.out.println(egender);
		System.out.println(empmail);
		System.out.println(Dob);
		System.out.println(Terms);
		System.out.println(Country);
		
		
		Employee employee=new Employee();
		
		int cid=Integer.parseInt(eid);
		employee.setId(cid);
		
		Long lid=Long.parseLong(epassword);
		employee.setPassword(lid);
		
		employee.setName(ename);
		employee.setGender(egender);
		employee.setMail(empmail);
		employee.setDob(Dob);
		employee.setTerms(Terms);
		
		
		System.out.println(employee);
		
		
		EmployeeDao employeeDao=new EmployeeDao();
		employeeDao.insert(employee);
		
		
		
		

//		res.getWriter().print(eid);
//		res.getWriter().print(ename);

	}

	@Override
	public String getServletInfo() {

		return null;
	}

	@Override
	public void destroy() {

	}

}
