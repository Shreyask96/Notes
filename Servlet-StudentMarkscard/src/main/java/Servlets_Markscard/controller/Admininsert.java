package Servlets_Markscard.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Servlets_Markscard.dao.Admindao;
import Servlets_Studentsmarkscard.dto.Admindto;

@WebServlet("/insert")
public class Admininsert extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String Usn=req.getParameter("usn");
		String Sname=req.getParameter("sname");
		String Fname=req.getParameter("fname");
		String Gender=req.getParameter("gender");
		String Physics=req.getParameter("physics");
		String Chemistry=req.getParameter("chemistry");
		String Maths=req.getParameter("maths");
		String Statistics=req.getParameter("stats");
		
		
		
		Admindto admindto=new Admindto();
		
		int cusn=Integer.parseInt(Usn);
		admindto.setUsn(cusn);
		
		admindto.setStudent_Name(Sname);
		admindto.setFathername(Fname);
		admindto.setGender(Gender);
		
		int cphysics=Integer.parseInt(Physics);
		admindto.setPhysics(cphysics);
		int cchemistry=Integer.parseInt(Chemistry);
		admindto.setPhysics(cchemistry);
		int cmaths=Integer.parseInt(Maths);
		admindto.setPhysics(cmaths);
		int cstats=Integer.parseInt(Statistics);
		admindto.setPhysics(cstats);
		
		System.out.println(admindto);
		
		Admindao admindao=new Admindao();
		admindao.insert(admindto);
	}

}
