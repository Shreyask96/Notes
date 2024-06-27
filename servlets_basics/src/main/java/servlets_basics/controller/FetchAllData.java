package servlets_basics.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import servlets_basics.dao.EmployeeDao;
import servlets_basics.dto.Employee;

@WebServlet("/mno")
public class FetchAllData extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		EmployeeDao dao=new EmployeeDao();
		List<Employee> l=dao.fetchall();
		
		String str="";
		
		for(Employee e:l)
		{
			str=str+e;
		}
		res.getWriter().print(str);
		
	}

}
