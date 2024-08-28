package web.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.servlet.controller.workshop03.User;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public MainServlet() {
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		
		User user= new User("kosta",1234,"박혜린","종각");
		
		request.setAttribute("user", user);
		PrintWriter out = response.getWriter();
		if(id.equals(user.getId())) {
//		request.getRequestDispatcher("loginSuccess.jsp").forward(request, response);
			out.println("<a href='loginSuccess.jsp'>Succssses성공</a>");
		}else {
			request.getRequestDispatcher("loginError.jsp").forward(request, response);
			out.println("<a href='loginError.jsp'>Succssses성공</a>");
		}
		
	}

}
