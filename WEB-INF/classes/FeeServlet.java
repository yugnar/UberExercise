import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import javax.servlet.annotation.WebServlet;

@WebServlet("/getFee")
public class FeeServlet extends HttpServlet{

	public void init(ServletConfig config){
		try{
			super.init(config);
		}
		catch(Exception e){
			e.printStackTrace();
		}	
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res){

		try{
			double price = Double.parseDouble(req.getParameter("fare"));
			double totprice = price *.25;

			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			req.setAttribute("res",totprice);

			RequestDispatcher disp = getServletContext().getRequestDispatcher("/fareResult.jsp");

			if(disp!=null){
				disp.forward(req,res);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
