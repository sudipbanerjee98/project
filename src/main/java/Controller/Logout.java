package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logout")
public class Logout extends HttpServlet{
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		
		
		arg0.getSession().invalidate();// it is use to destroy or kill the session which hasbeen created
		arg1.getWriter().print("<h1>Logout successful</h1>");
		
		arg0.getRequestDispatcher("Home.html").include(arg0, arg1);
	}

}
