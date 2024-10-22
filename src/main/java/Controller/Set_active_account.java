package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/setactiveaccount")
public class Set_active_account  extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String ac_no = req.getParameter("accno");
		long ac_number =Long.parseLong(ac_no);
		
		
		req.getSession().setAttribute("ac_number", ac_number); // here we are going to set the account by using session tracking
		req.getRequestDispatcher("Account_home_page.html").include(req, resp);
		
		
	}

}
