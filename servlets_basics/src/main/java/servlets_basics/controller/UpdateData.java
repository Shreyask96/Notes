package servlets_basics.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlets_basics.dao.EmployeeDao;
import servlets_basics.dto.Employee;

@WebServlet("/update")
public class UpdateData extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		String eid = req.getParameter("id");
		String ename = req.getParameter("name");
		String epassword = req.getParameter("pwd");
		String egender = req.getParameter("gender");
		String empmail = req.getParameter("mail");
		String Dob = req.getParameter("dob");
		
		Employee employee=new Employee();
		int cid=Integer.parseInt(eid);
		employee.setId(cid);
		
		Long lid=Long.parseLong(epassword);
		employee.setPassword(lid);
		
		employee.setName(ename);
    	employee.setGender(egender);
		employee.setMail(empmail);
		employee.setDob(Dob);
		
		System.out.println(employee);
		
		
		EmployeeDao dao=new EmployeeDao();
		dao.updateAll(employee);
		
		

	}

}
