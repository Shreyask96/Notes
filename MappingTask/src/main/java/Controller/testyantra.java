package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.insertoperation;
import Dto.Branches;
import Dto.TestYantra;

@WebServlet("/test")
public class testyantra extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
//		Branches branches1=new Branches();
//		branches1.setBranchid(1);
//		branches1.setBranchname("Rajajinagar");
//		
//		Branches branches2=new Branches();
//		branches2.setBranchid(2);
//		branches2.setBranchname("Hebbal");
//		
//
//		ArrayList a=new ArrayList();
//		a.add(branches1);
//		a.add(branches2);
		
		
		String gst=req.getParameter("Gst");
		String cname=req.getParameter("Cname");
		
		TestYantra testYantra=new TestYantra();
		
		int cid=Integer.parseInt(gst);
		testYantra.setGst(gst);
		testYantra.setCname(cname);
		
		
		insertoperation i=new insertoperation();
		i.insertyantra(testYantra);	
		
	}
}
