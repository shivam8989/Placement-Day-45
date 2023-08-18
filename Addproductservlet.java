package Test;
import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import jakarta.servlet.GenericServlet;
@SuppressWarnings("serial")
@WebServlet("/add")
public class Addproductservlet extends GenericServlet {
	
	public void service(ServletResponse res, ServletRequest req) throws ServletException,IOException{
		PrintWriter pw = res.getWriter();
		Productbean pb = new Productbean();
		pb.setPcode(req.getParameter("pcode"));
		pb.setName(req.getParameter("name"));
		pb.setPrice(Float.parseFloat(req.getParameter("price")));
		pb.setQty(Integer.parseInt(req.getParameter("qty")));
		int k = new InsertProductDAO().insert(pb);
		if(k>0) {
			pw.println("Product added sucessfully<br>");
			RequestDispatcher rd =req.getRequestDispatcher("input.html");
			rd.include(req,res);
		}
		
	}

	@Override
	public void service(jakarta.servlet.ServletRequest arg0, jakarta.servlet.ServletResponse arg1)
			throws jakarta.servlet.ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
	

}
