package servlets_basics.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlets_basics.dao.EmployeeDao;
import servlets_basics.dto.Employee;

@WebServlet("/def")
public class DeleteData extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("primarykey");
		int cid = Integer.parseInt(id);

		EmployeeDao employeedao = new EmployeeDao();
		employeedao.delete(cid);

//		List<Employee> list = employeedao.fetchall();
//		req.setAttribute("objects", list);
//
//		RequestDispatcher rd = req.getRequestDispatcher("download.jsp");
//		rd.forward(req, resp);

	}

}
